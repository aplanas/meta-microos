SUMMARY = "Development tools for programs which uses QwtPlot3D Widget set"
DESCRIPTION = "QwtPlot3D is a feature-rich Qt/OpenGL-based C++ programming library. \
It provides essentially a bunch of 3D widgets for programmers."
LICENSE = "Zlib"

PV = "0.2.7+git20190410.a6d0890d"

RPM_NAME = "qwtplot3d-devel-0.2.7+git20190410.a6d0890d-1.22.aarch64.rpm"
RPM_HASH = "28429add0f060f0715a43825c7aac60b685b1b6f71847db1b1d0f96655ab39db301b407a18f4299f382d78ceb2913583ff8388135acefbb1abfb6adfe2c98f61"

RPROVIDES:${PN} += "qwtplot3d-devel"

RDEPENDS:${PN} += "libqwtplot3d-qt5-0"

inherit rpm
