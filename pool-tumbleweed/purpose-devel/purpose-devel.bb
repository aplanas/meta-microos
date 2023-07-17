SUMMARY = "Framework to integrate services and actions - Build Environment"
DESCRIPTION = "This package contains development files needed to build applications which rely on the purpose framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "purpose-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "08b47af72c83c23f4e026860bcce735ff927e97dab6790cf9347ff6bf34de453c0c52b74db5977527de17212d4bae8a5ae4b33aa9d2d68918041cd3457160962"

RPROVIDES:${PN} += "cmake-KDEExperimentalPurpose \
cmake-KF5Purpose \
purpose-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
libKF5Purpose5 \
libKF5PurposeWidgets5 \
purpose"

inherit rpm
