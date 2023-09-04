SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5CoreAddons5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c728daa8bdab0d9fd0d3071892a319b90db5c8b064aee8ca0c729a4d34562664576e11ce33d5a40f0e8ce868191bd417d0925ba8bf3aafa71927032361d17775"

RPROVIDES:${PN} += "libKF5CoreAddons.so.5 \
libKF5CoreAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
