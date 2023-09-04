SUMMARY = "Busybox applets replacing time"
DESCRIPTION = "This package contains the symlinks to provide time with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-time-1.36.1-28.1.noarch.rpm"
RPM_HASH = "997cf47aac6fac0b5053da6adbd8d437a8e0106dba3134ec4a9e14151bdf2dd7e2bcaa3038685a88ace7bd4adec9e7fcfc58293881e876d71d274857040bce0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-time"

RDEPENDS:${PN} += "busybox"

inherit rpm
