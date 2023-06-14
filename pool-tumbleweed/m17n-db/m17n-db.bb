SUMMARY = "Database Needed by the m17n Library m17n-lib"
DESCRIPTION = "Database that is needed by the m17n library 'm17n-lib'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain & MIT"

PV = "1.8.0"

RPM_NAME = "m17n-db-1.8.0-1.8.noarch.rpm"
RPM_HASH = "c1c368b862a07c01972bf525dfa13f11e5c0f534baa18a63a60daaf16ef4788b53e5c13b5fa256342d2a7dcf8a7350239f767f6867c66b28b308b4731eadf1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "m17n-contrib \
m17n-db \
pkgconfig-m17n-db"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/gawk \
/usr/bin/pkg-config"

inherit rpm
