SUMMARY = "OpenJDK 17 Runtime Environment with Eclipse OpenJ9 virtual machine"
DESCRIPTION = "The OpenJDK 17 with Eclipse OpenJ9 virtual machine. Eclipse OpenJ9 \
is a Java Virtual Machine for OpenJDK that is optimized for small \
footprint, fast start-up, and high throughput. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-17.0.6.0-2.1.aarch64.rpm"
RPM_HASH = "9c133dc877dde175359dcd4adff729f60dfe8c3b55362979c2279d8f4cec9f30fca58078f3dcbbf4df1455c716d3d721a1941bbdf11dbcc3db5fe98ca3f3d011"

RPROVIDES:${PN} += "java \
java-17 \
java-17-64 \
java-17-openj9 \
java-17-openj9(aarch-64) \
java-64 \
java-fonts \
java-openj9 \
java-openj9-64 \
java-openjdk \
java-openjdk-64 \
jre \
jre-17 \
jre-17-64 \
jre-17-openj9 \
jre-17-openj9-64 \
jre-17-openjdk \
jre-17-openjdk-64 \
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
libawt_xawt.so()(64bit) \
libjawt.so()(64bit) \
libsplashscreen.so()(64bit)"

RDEPENDS:${PN} += "file \
fontconfig \
java-17-openj9-headless \
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
