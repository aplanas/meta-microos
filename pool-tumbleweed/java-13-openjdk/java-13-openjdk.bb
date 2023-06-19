SUMMARY = "OpenJDK 13 Runtime Environment"
DESCRIPTION = "The OpenJDK 13 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-13.0.14.0-2.3.aarch64.rpm"
RPM_HASH = "70cb2d50642b73e0aa6bdbdd387bf081df2cd7022a1d9248f2f3751de524bfa933bcecabce835fd14019ec3fca51bb3b41b4cef87efabc7bb139e17973ca9d48"

RPROVIDES:${PN} += "java \
java-13 \
java-13-64 \
java-13-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-13 \
jre-13-64 \
jre-13-openjdk \
jre-13-openjdk-64 \
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
java-13-openjdk-headless \
java-ca-certificates \
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
libpng16.so.16 \
mozilla-nss"

inherit rpm
