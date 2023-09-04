SUMMARY = "OpenJDK 17 Runtime Environment"
DESCRIPTION = "The OpenJDK 17 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.1"

RPM_NAME = "java-17-openjdk-17.0.8.1-1.1.aarch64.rpm"
RPM_HASH = "10c87a62aed77c63c66eb4317724c1ceaf8e91548f922b85613c7f85dfefc8872af3b5da8c768e9f4beb66d10c6fe3dec0723613b6e8bbf676e9a99b337b2b82"

RPROVIDES:${PN} += "java \
java-17 \
java-17-64 \
java-17-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-17 \
jre-17-64 \
jre-17-openjdk \
jre-17-openjdk-64 \
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
java-17-openjdk-headless \
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
