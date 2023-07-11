SUMMARY = "OpenJDK 20 Runtime Environment"
DESCRIPTION = "The OpenJDK 20 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "20.0.1.0"

RPM_NAME = "java-20-openjdk-20.0.1.0-1.2.aarch64.rpm"
RPM_HASH = "c29674ca2dd3b39c2deb6127173c3b66f81b60fa58b8f56f2d1f7ea75f901a964965cd0a011047414fd8c51f78c7f9990998d4babc29fc0e823f4798ade98a05"

RPROVIDES:${PN} += "java \
java-20 \
java-20-64 \
java-20-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-20 \
jre-20-64 \
jre-20-openjdk \
jre-20-openjdk-64 \
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
java-20-openjdk-headless \
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
