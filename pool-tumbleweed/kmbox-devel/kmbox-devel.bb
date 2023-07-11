SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kmbox-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d87d1fd155763b437c4b9f7b4748c4e4b56e4334ab3e2be315e508c5047a20f011a9fc67c0f04e8a485009341e8fa4194f0bce1a7e97ef44d4d9aceb950890d4"

RPROVIDES:${PN} += "cmake-KF5Mbox \
cmake-KPim5Mbox \
kmbox-devel"

RDEPENDS:${PN} += "cmake-KPim5Mime \
libKPim5Mbox5"

inherit rpm
