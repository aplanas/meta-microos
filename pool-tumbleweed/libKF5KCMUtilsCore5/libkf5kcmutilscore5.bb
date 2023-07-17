SUMMARY = "Core library of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. This package provides the main core library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5KCMUtilsCore5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e6fcc96abd9edbeb63d0229513cad4d38c31fb5e3cbf268c2966204614b0db6f8cd488ad56e9e3ea9596892c8e83e38a04ee1167a325c90f13585797262a8891"

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
