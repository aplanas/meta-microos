SUMMARY = "Rich client application platform for Java"
DESCRIPTION = "JavaFX/OpenJFX is a set of graphics and media APIs that enables Java \
developers to design, create, test, debug, and deploy rich client \
applications that operate consistently across diverse platforms."
LICENSE = "BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-8.0.202-8.3.aarch64.rpm"
RPM_HASH = "b3c91a2302997811833e85d4f36612647ba178fa970bf7da3cd6fe9829204fcaf641a4cf7b4f7881cf8d9f7470d4ab46ac62c8a984742dde4d7524b0f4f9f1da"

RPROVIDES:${PN} += "java-1_8_0-openjfx \
libdecora_sse.so()(64bit) \
libglass.so()(64bit) \
libglassgtk2.so()(64bit) \
libglassgtk3.so()(64bit) \
libjavafx_font.so()(64bit) \
libjavafx_font_freetype.so()(64bit) \
libjavafx_font_pango.so()(64bit) \
libjavafx_iio.so()(64bit) \
libprism_common.so()(64bit) \
libprism_es2.so()(64bit) \
libprism_sw.so()(64bit) \
openjfx8 \
openjfx8(aarch-64)"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.35)(64bit)"

inherit rpm
