SUMMARY = "OpenJDK 17 Runtime Environment"
DESCRIPTION = "The OpenJDK 17 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openjdk-17.0.8.0-1.1.aarch64.rpm"
RPM_HASH = "5fe1426c412f840b3e1df7d2467541edadb43d7d526e96b77a79ff0d9b1c17d456f778cbfb3cdf574fa2cf40f9a1ea16a34516320a7527d2f392e59d24a45d00"

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
