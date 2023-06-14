SUMMARY = "Development tools for programs which uses QwtPlot3D Widget set"
DESCRIPTION = "QwtPlot3D is a feature-rich Qt/OpenGL-based C++ programming library. \
It provides essentially a bunch of 3D widgets for programmers."
LICENSE = "Zlib"

PV = "0.2.7+git20190410.a6d0890d"

RPM_NAME = "qwtplot3d-devel-0.2.7+git20190410.a6d0890d-1.21.aarch64.rpm"
RPM_HASH = "60bea561f26b5c881aeca159d2bf68784c26ee384a2449a73248f63010012b8d85e192f1ab26e22e16ec6cbe5152ca752e1c00fb098557fbd0300d6e7ac9ea49"

RPROVIDES:${PN} += "qwtplot3d-devel"

RDEPENDS:${PN} += "libqwtplot3d-qt5-0"

inherit rpm
