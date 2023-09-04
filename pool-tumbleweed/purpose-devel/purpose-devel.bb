SUMMARY = "Framework to integrate services and actions - Build Environment"
DESCRIPTION = "This package contains development files needed to build applications which rely on the purpose framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "purpose-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "3b69e0eba14920a53891814ec3335a6db7561eefb014559621c55c050dd985f9061e62c918a9096a092effa566c1a19b3feb76e42005473e7d82fb050e3d10c2"

RPROVIDES:${PN} += "cmake-KDEExperimentalPurpose \
cmake-KF5Purpose \
purpose-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
libKF5Purpose5 \
libKF5PurposeWidgets5 \
purpose"

inherit rpm
