SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-kab-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "145dc65367a984bab9cf4c3d47610e86c4ec8e4ab28a03a08898c096a35ff215078fe58d4c31c381437354fc3a5778ef9572bcbe02ae17e87fb5cdfa67bad52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-kab \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
