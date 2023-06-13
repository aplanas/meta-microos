SUMMARY = "OpenJDK 8 Runtime Environment with Eclipse OpenJ9 virtual machine"
DESCRIPTION = "The OpenJDK 8 with Eclipse OpenJ9 virtual machine. Eclipse OpenJ9 \
is a Java Virtual Machine for OpenJDK that is optimized for small \
footprint, fast start-up, and high throughput. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-1.8.0.362-2.1.aarch64.rpm"
RPM_HASH = "34eae728ba023998160207b39c8e998427112a536a98089cd26df368ca070df651a38dcff0ebca4f9e94aaca41d6789e9e21a170129111fc157bb274df9adb07"

RPROVIDES:${PN} += "java \
java-1.8.0 \
java-1.8.0-64 \
java-1_8_0-openj9 \
java-1_8_0-openj9(aarch-64) \
java-64 \
java-fonts \
java-openj9 \
java-openjdk \
java-openjdk-64 \
jre \
jre-1.8.0 \
jre-1.8.0-64 \
jre-1.8.0-openj9 \
jre-1.8.0-openj9-64 \
jre-1.8.0-openjdk \
jre-1.8.0-openjdk-64 \
jre-64 \
jre-openj9 \
jre-openj9-64 \
jre-openjdk \
jre-openjdk-64 \
jre1.3.x \
jre1.4.x \
jre1.5.x \
jre1.6.x \
jre1.7.x \
jre1.8.x \
libawt_xawt.so()(64bit) \
libawt_xawt.so(SUNWprivate_1.1)(64bit) \
libjawt.so()(64bit) \
libjawt.so(SUNWprivate_1.1)(64bit) \
libjsoundalsa.so()(64bit) \
libjsoundalsa.so(SUNWprivate_1.1)(64bit) \
libsplashscreen.so()(64bit) \
libsplashscreen.so(SUNWprivate_1.1)(64bit)"

RDEPENDS:${PN} += "file \
fontconfig \
java-1_8_0-openj9-headless \
java-ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXrender.so.1()(64bit) \
libXtst.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libawt.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgif.so.7()(64bit) \
libjava.so()(64bit) \
libjava.so(SUNWprivate_1.1)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjvm.so()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
mozilla-nss"

inherit rpm
