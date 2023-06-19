SUMMARY = "Rich client application platform for Java"
DESCRIPTION = "JavaFX/OpenJFX is a set of graphics and media APIs that enables Java \
developers to design, create, test, debug, and deploy rich client \
applications that operate consistently across diverse platforms."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-8.0.202-8.3.aarch64.rpm"
RPM_HASH = "b3c91a2302997811833e85d4f36612647ba178fa970bf7da3cd6fe9829204fcaf641a4cf7b4f7881cf8d9f7470d4ab46ac62c8a984742dde4d7524b0f4f9f1da"

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
