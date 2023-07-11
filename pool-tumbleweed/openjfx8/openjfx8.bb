SUMMARY = "Rich client application platform for Java"
DESCRIPTION = "JavaFX/OpenJFX is a set of graphics and media APIs that enables Java \
developers to design, create, test, debug, and deploy rich client \
applications that operate consistently across diverse platforms."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-8.0.202-8.4.aarch64.rpm"
RPM_HASH = "d58ba1d2c6d20a97e025c89398f5512356ed707db61942252f362d24f3aa50c4d0045de42440173bf3d0c14ee8e3cbc06ca2e0971a597d16fe4ff652f3ede905"

RPROVIDES:${PN} += "java-1-8-0-openjfx \
libdecora-sse.so \
libglass.so \
libglassgtk2.so \
libglassgtk3.so \
libjavafx-font-freetype.so \
libjavafx-font-pango.so \
libjavafx-font.so \
libjavafx-iio.so \
libprism-common.so \
libprism-es2.so \
libprism-sw.so \
openjfx8"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
