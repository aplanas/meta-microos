SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmbox-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0039f669ca6d746be2fb7117b43b77fee3a59128c9a8962826054d9486b63e8f6f048c1a6e4059aa3d6c23262da8c688cc419b1cfb124f51eab2dceba4feb928"

RPROVIDES:${PN} += "cmake-KPim5Mbox \
kmbox-devel"

RDEPENDS:${PN} += "cmake-KPim5Mime \
libKPim5Mbox5"

inherit rpm
