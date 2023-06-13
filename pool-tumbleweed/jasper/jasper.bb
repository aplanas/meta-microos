SUMMARY = "An Implementation of the JPEG-2000 Standard, Part 1"
DESCRIPTION = "This package contains an implementation of the image compression \
standard, JPEG-2000, Part 1. It consists of tools for conversion to and \
from the JP2 and JPC formats."
LICENSE = "JasPer-2.0"

PV = "4.0.0"

RPM_NAME = "jasper-4.0.0-1.3.aarch64.rpm"
RPM_HASH = "13e3429328907ad196170d73097d5ecbf3feada9b8d1a0e2856f075a9fe23f4c367ffb5c5a10e43eb872767ed3d1ee87bdbc6d1a9aabd575a83085966cb35624"

RPROVIDES:${PN} += "jasper \
jasper(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libc.so.6()(64bit) \
libglut.so.3()(64bit) \
libjasper.so.7()(64bit) \
libm.so.6()(64bit)"

inherit rpm
