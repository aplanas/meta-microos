SUMMARY = "KDE PIM Libraries: Identity Management - development files"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications that make use of multiple email identities."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kidentitymanagement-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6a2b5c9138fcad45b46cc938aa2f83a1ffec9c443dab84d9d4394d7a0ff0ed75417bafc39eaf8097333abdd2b1f7f2b43cadc110e1c7da3dfdfd140d7f1dd29f"

RPROVIDES:${PN} += "cmake-KF5IdentityManagement \
cmake-KPim5IdentityManagement \
kidentitymanagement-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-KF5TextEditTextToSpeech \
cmake-KPim5TextEdit \
libKPim5IdentityManagement5 \
libKPim5IdentityManagementWidgets5"

inherit rpm
