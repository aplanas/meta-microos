SUMMARY = "OpenJDK 8 Runtime Environment with Eclipse OpenJ9 virtual machine"
DESCRIPTION = "The OpenJDK 8 with Eclipse OpenJ9 virtual machine. Eclipse OpenJ9 \
is a Java Virtual Machine for OpenJDK that is optimized for small \
footprint, fast start-up, and high throughput. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openj9-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "e7615546c2bf547f335de8d4a46339c47549db8dd7caa96d4e8ba1ec8e259be52e4e48c05a5c6072700e93041f57d5106809149d1537d30ed8119d94a7ccf1da"

RPROVIDES:${PN} += "java \
java-1-8-0-openj9 \
java-1.8.0 \
java-1.8.0-64 \
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
libawt-xawt.so \
libjawt.so \
libjsoundalsa.so \
libsplashscreen.so"

RDEPENDS:${PN} += "file \
fontconfig \
java-1-8-0-openj9-headless \
java-ca-certificates \
ld-linux-aarch64.so.1 \
libX11.so.6 \
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
libpng16.so.16 \
mozilla-nss"

inherit rpm
