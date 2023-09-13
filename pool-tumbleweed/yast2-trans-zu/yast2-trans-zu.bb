SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-zu-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "e7d2e9f3c0821151f283bb1115e52788b085ba06966da01e7a9b86c5c7e3cf232f2b65de9a639fb9502c27c60091acb55e6c74718f904093b1d3c26114cc61ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zu \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm
