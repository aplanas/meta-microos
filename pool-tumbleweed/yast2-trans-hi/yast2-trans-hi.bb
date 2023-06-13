SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-hi-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "e276a779e5f1ec36f9ace3b30827c5d8f0b579c4d4e85e22392b367abf7f16a5b17f38f48845cb8d01ba700cc5eaea891d8239304607967dd9096c18486faaa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:hi) \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
