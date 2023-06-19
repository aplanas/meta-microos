SUMMARY = "OpenJDK 15 Runtime Environment"
DESCRIPTION = "The OpenJDK 15 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-15.0.10.0-2.3.aarch64.rpm"
RPM_HASH = "14fb58462bab5d6c94ec73e979729702eaf5d6323cb3dcbc58794d3106aa4d42f421b73574315e4a6268761a9261b02000864fd4350640f4f8858e593dd80c46"

RPROVIDES:${PN} += "java \
java-15 \
java-15-64 \
java-15-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-15 \
jre-15-64 \
jre-15-openjdk \
jre-15-openjdk-64 \
jre-64 \
jre-openjdk \
jre-openjdk-64 \
jre1.1openSUSE-Leap-42.30.x \
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
java-15-openjdk-headless \
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
