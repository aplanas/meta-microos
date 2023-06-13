SUMMARY = "OpenJDK 15 Runtime Environment"
DESCRIPTION = "The OpenJDK 15 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-15.0.10.0-2.3.aarch64.rpm"
RPM_HASH = "14fb58462bab5d6c94ec73e979729702eaf5d6323cb3dcbc58794d3106aa4d42f421b73574315e4a6268761a9261b02000864fd4350640f4f8858e593dd80c46"

RPROVIDES:${PN} += "java \
java-15 \
java-15-64 \
java-15-openjdk \
java-15-openjdk(aarch-64) \
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
jre1.1openSUSE_Leap_42.30.x \
jre1.3.x \
jre1.4.x \
jre1.5.x \
jre1.6.x \
jre1.7.x \
jre1.8.x \
jre1.9.x \
libawt_xawt.so()(64bit) \
libjawt.so()(64bit) \
libsplashscreen.so()(64bit)"

RDEPENDS:${PN} += "file \
fontconfig \
java-15-openjdk-headless \
java-ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXrender.so.1()(64bit) \
libXtst.so.6()(64bit) \
libawt.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgif.so.7()(64bit) \
libjava.so()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
mozilla-nss"

inherit rpm
