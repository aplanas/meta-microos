SUMMARY = "Java bindings for various native APIs"
DESCRIPTION = "A collection of cross-platform Java APIs \
for various native APIs. \
 \
These APIs support Java 5 and later. Some \
of these APIs overlap with APIs available \
in later Java versions."
LICENSE = "Apache-2.0"

PV = "0.14"

RPM_NAME = "native-platform-0.14-2.9.aarch64.rpm"
RPM_HASH = "c03dfb8a6cdfff9d622ed9c704277a873a1cc093d4d343bd120ea18b9fc51db53d763f8f4a27f8f1e1080b57f9da8ff28750cf095f635deb0abbb3cab52d3c48"

RPROVIDES:${PN} += "libnative-platform-curses.so()(64bit) \
libnative-platform.so()(64bit) \
mvn(net.rubygrapefruit:native-platform) \
native-platform \
native-platform(aarch-64)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
