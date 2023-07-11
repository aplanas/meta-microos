SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kcalutils-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "daa9d20937f05d9ede001f60860d4530846088990f3dbe2678ea805192431a7713303cd43b677c6b794c92095201fdecb591e62339253fe10a9ac3f31e01ae7b"

RPROVIDES:${PN} += "kcalutils"

RDEPENDS:${PN} += "grantlee5 \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5IconThemes.so.5 \
libKPim5CalendarUtils.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
