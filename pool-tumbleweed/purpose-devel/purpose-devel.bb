SUMMARY = "Framework to integrate services and actions - Build Environment"
DESCRIPTION = "This package contains development files needed to build applications which rely on the purpose framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "purpose-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "640e4a096cdfc0c9f706a74738eb0cc5f9f3d3bb91265d015376ec828b5da1dff6488c0f4c7a4622756f5d9f8b006867c90097c220769d4af970a37131d763d7"

RPROVIDES:${PN} += "cmake-KDEExperimentalPurpose \
cmake-KF5Purpose \
purpose-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
libKF5Purpose5 \
libKF5PurposeWidgets5 \
purpose"

inherit rpm
