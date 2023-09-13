SUMMARY = "Common PHP MAPI header files for grommunio"
DESCRIPTION = "PHP files shared between grommunio-web, grommunio-sync and other PHP \
applications from the groupware suite."
LICENSE = "AGPL-3.0-or-later"

PV = "1.2.0.0db2832"

RPM_NAME = "mapi-header-php-1.2.0.0db2832-1.1.noarch.rpm"
RPM_HASH = "fb819a247a64066646ee0378885a3e1a56cc08b38f48c324ea366986728c82d09e1a0c887148c9732342d4b7968b1bc7f41af737c49653a8f1421074b89b98a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mapi-header-php"

RDEPENDS:${PN} += ""

inherit rpm
