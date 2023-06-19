SUMMARY = "OpenJDK 19 Runtime Environment"
DESCRIPTION = "The OpenJDK 19 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "19.0.2.0"

RPM_NAME = "java-19-openjdk-19.0.2.0-3.3.aarch64.rpm"
RPM_HASH = "44cb4e14063e21fedf413fe05bd66cd839e61120905329b34728521394c9b594158e957efff6d91eff0336b05330ee64b97e1840802f522b2195653518c3f750"

RPROVIDES:${PN} += "java \
java-19 \
java-19-64 \
java-19-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-19 \
jre-19-64 \
jre-19-openjdk \
jre-19-openjdk-64 \
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
java-19-openjdk-headless \
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
