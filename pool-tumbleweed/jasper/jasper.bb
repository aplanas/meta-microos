SUMMARY = "An Implementation of the JPEG-2000 Standard, Part 1"
DESCRIPTION = "This package contains an implementation of the image compression \
standard, JPEG-2000, Part 1. It consists of tools for conversion to and \
from the JP2 and JPC formats."
LICENSE = "JasPer-2.0"

PV = "4.0.0"

RPM_NAME = "jasper-4.0.0-1.4.aarch64.rpm"
RPM_HASH = "d6c60f3fd5e84578fe426ddeda16b889fbc1ee5f793ae956f4a8321c11207052f3d38a27c844a94a92cfb0c722a3875563968e882b9729bc181b037d117f9580"

RPROVIDES:${PN} += "jasper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libc.so.6 \
libglut.so.3 \
libjasper.so.7 \
libm.so.6"

inherit rpm
