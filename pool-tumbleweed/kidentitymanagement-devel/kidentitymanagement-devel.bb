SUMMARY = "KDE PIM Libraries: Identity Management - development files"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications that make use of multiple email identities."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kidentitymanagement-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "cc20e22afecfc47a3f4c1800be6d12813545febe75a8ab9dd73a53115ea449071f88f4c626522b84cc896d469e7960a38449a2ab31d66b1500695a8499564030"

RPROVIDES:${PN} += "cmake-KF5IdentityManagement \
cmake-KPim5IdentityManagement \
kidentitymanagement-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-KF5TextEditTextToSpeech \
cmake-KPim5TextEdit \
libKPim5IdentityManagement5 \
libKPim5IdentityManagementWidgets5"

inherit rpm
