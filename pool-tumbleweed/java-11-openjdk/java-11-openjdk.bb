SUMMARY = "OpenJDK 11 Runtime Environment"
DESCRIPTION = "The OpenJDK 11 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openjdk-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "17e8a8c5a381aace02e831cdb066d2187a695d28c55a100bb34520e66225c8e1f5c5e7bd2603222fd1a072e677a8dbe943a51db20f0498028ba1dd02f835684b"

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
