SUMMARY = "Core library of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. This package provides the main core library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5KCMUtilsCore5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "e1c0824a9b239a913bba56f0e368308aa9f44443b070ebb3900defae56cd817ec6b44980d6f8bbf1550a8664dc1fa57fcbd2ca8e62e5c69db6747b673402f4c0"

RPROVIDES:${PN} += "libKF5KCMUtilsCore.so.5 \
libKF5KCMUtilsCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
