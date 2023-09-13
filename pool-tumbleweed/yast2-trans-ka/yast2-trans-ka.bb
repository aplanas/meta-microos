SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ka-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "0232ae542db6b81b6b00f576e9a1cb080d1189a7240d4fc91e0922a6e2d050dd21a0356ddd7031355be95b8d2e2577e76f7b87dcd647bd1163b6ea8cbdd5063b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
