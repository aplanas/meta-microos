SUMMARY = "OpenJDK 11 Runtime Environment"
DESCRIPTION = "The OpenJDK 11 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.0"

RPM_NAME = "java-11-openjdk-11.0.20.0-1.1.aarch64.rpm"
RPM_HASH = "43e2f5124cf660a8fc2985c49968c0e6868ef9432e41e94b3f8d2f6e2f46606013d641c15f33cadef7d6f2d0e59f7cae1733231d75dd8312bbe614e8e6d119cf"

RPROVIDES:${PN} += "java \
java-10-openjdk \
java-11 \
java-11-64 \
java-11-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-11 \
jre-11-64 \
jre-11-openjdk \
jre-11-openjdk-64 \
jre-64 \
jre-openjdk \
jre-openjdk-64 \
jre1.10.x \
jre1.3.x \
jre1.4.x \
jre1.5.x \
jre1.6.x \
jre1.7.x \
jre1.8.x \
jre1.9.x \
libawt-xawt.so \
libjawt.so \
libsplashscreen.so"

RDEPENDS:${PN} += "file \
fontconfig \
java-11-openjdk-headless \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXrender.so.1 \
libXtst.so.6 \
libawt.so \
libc.so.6 \
libgif.so.7 \
libjava.so \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16"

inherit rpm
