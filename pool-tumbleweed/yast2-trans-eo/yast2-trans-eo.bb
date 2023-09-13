SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-eo-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "f680678bf14ee32a88e80adab13117b3f6cd6a01bed9a44d9b3fa38fffb4bba84ee225b2f74ae7ab405ecaede81d1ca3bc18dc88bbc21bc01bf938f1120436c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eo \
yast2-trans-eo"

RDEPENDS:${PN} += ""

inherit rpm
