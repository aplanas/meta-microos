SUMMARY = "Core library of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. This package provides the main core library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5KCMUtilsCore5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "44004e8ea4d083697803a6536301df53516af41bb58cd935fc88ee82b331915ef078c0bf11a08ccd2929bdf0e38a9aae4cad975002c7b0dbe2b951b925526b7b"

RPROVIDES:${PN} += "libKF5KCMUtilsCore.so.5()(64bit) \
libKF5KCMUtilsCore5 \
libKF5KCMUtilsCore5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
