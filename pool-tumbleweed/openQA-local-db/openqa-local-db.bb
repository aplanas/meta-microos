SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-local-db-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "ceccad8221d303ad8a98d6cb75bf2fe3d76c864d470caf0292abe26dea3bad4f9c90e4a934a8417fb0935623361071816d985464c823d73281b9c86f8bf56948"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
