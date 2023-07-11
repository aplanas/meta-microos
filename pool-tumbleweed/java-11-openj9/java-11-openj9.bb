SUMMARY = "OpenJDK 11 Runtime Environment with Eclipse OpenJ9 virtual machine"
DESCRIPTION = "The OpenJDK 11 with Eclipse OpenJ9 virtual machine. Eclipse OpenJ9 \
is a Java Virtual Machine for OpenJDK that is optimized for small \
footprint, fast start-up, and high throughput. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-11.0.18.0-2.3.aarch64.rpm"
RPM_HASH = "74a21735c05973445df2387e9ef43cfcaa55e48499a3f8f18469731b7e5ab29384f2b428b65b4dab3f4fd0cd932087bc1907b60d11bbf704f09e471296ef45c5"

RPROVIDES:${PN} += "java \
java-11 \
java-11-64 \
java-11-openj9 \
java-64 \
java-fonts \
java-openj9 \
java-openj9-64 \
java-openjdk \
java-openjdk-64 \
jre \
jre-11 \
jre-11-64 \
jre-11-openj9 \
jre-11-openj9-64 \
jre-11-openjdk \
jre-11-openjdk-64 \
jre-64 \
jre-openj9 \
jre-openj9-64 \
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
java-11-openj9-headless \
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
