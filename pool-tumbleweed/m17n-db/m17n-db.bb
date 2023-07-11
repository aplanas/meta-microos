SUMMARY = "Database Needed by the m17n Library m17n-lib"
DESCRIPTION = "Database that is needed by the m17n library 'm17n-lib'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain & MIT"

PV = "1.8.2"

RPM_NAME = "m17n-db-1.8.2-1.1.noarch.rpm"
RPM_HASH = "09e3feb3352d3114134da1bb64231c0d681c58c1ccc029d78180e127eea1d678575276a531d0c022c6b9d392a91bc22572e592ffb2ed9b0c91319dd0d59a16b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "m17n-contrib \
m17n-db \
pkgconfig-m17n-db"

RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/pkg-config \
/usr/bin/sh"

inherit rpm
