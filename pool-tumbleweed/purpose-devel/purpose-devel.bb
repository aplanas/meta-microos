SUMMARY = "Framework to integrate services and actions - Build Environment"
DESCRIPTION = "This package contains development files needed to build applications which rely on the purpose framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "purpose-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "856c95fbf7082225aa1558ad57203e0f3c66792fa09fb1d363d6fa9067094fd325c8b3bc55a63bea2eefa154f21701325640519582951adaa7eb5b05f3416793"

RPROVIDES:${PN} += "cmake(KDEExperimentalPurpose) \
cmake(KF5Purpose) \
purpose-devel \
purpose-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5CoreAddons) \
extra-cmake-modules \
libKF5Purpose5 \
libKF5PurposeWidgets5 \
purpose"

inherit rpm
