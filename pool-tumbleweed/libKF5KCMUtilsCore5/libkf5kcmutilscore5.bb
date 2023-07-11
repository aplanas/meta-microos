SUMMARY = "Core library of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. This package provides the main core library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5KCMUtilsCore5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "adff72a3e8608527e7b35c1819559c070a1d1e23c8c1d53886b6a6e344c4d3fd632be7e1099e2eae26f15dae06ae8217b95618f850a2f6fb646da92dabb83015"

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
