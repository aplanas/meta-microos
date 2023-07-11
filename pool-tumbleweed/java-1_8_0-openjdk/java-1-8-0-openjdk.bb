SUMMARY = "OpenJDK 8 Runtime Environment"
DESCRIPTION = "The OpenJDK 8 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-1.8.0.372-1.2.aarch64.rpm"
RPM_HASH = "8f072c81afbed341fc0b46a7e33df48d95316ae0d487b2480ae1b7e5222759758090c415d61b0a2e478d4acabb5f91c6157863b78ca7c3aa1f7e66b032ad26bb"

RPROVIDES:${PN} += "java \
java-1-8-0-openjdk \
java-1.8.0 \
java-1.8.0-64 \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-1.8.0 \
jre-1.8.0-64 \
jre-1.8.0-openjdk \
jre-1.8.0-openjdk-64 \
jre-64 \
jre-openjdk \
jre-openjdk-64 \
jre1.3.x \
jre1.4.x \
jre1.5.x \
jre1.6.x \
jre1.7.x \
jre1.8.x \
libawt-xawt.so \
libjawt.so \
libjsoundalsa.so \
libsplashscreen.so"

RDEPENDS:${PN} += "file \
fontconfig \
java-1-8-0-openjdk-headless \
java-ca-certificates \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXi.so.6 \
libXrender.so.1 \
libXtst.so.6 \
libasound.so.2 \
libawt.so \
libc.so.6 \
libgif.so.7 \
libjava.so \
libjpeg.so.8 \
libjvm.so \
libm.so.6 \
libpng16.so.16"

inherit rpm
