SUMMARY = "Java bindings for various native APIs"
DESCRIPTION = "A collection of cross-platform Java APIs \
for various native APIs. \
 \
These APIs support Java 5 and later. Some \
of these APIs overlap with APIs available \
in later Java versions."
LICENSE = "Apache-2.0"

PV = "0.14"

RPM_NAME = "native-platform-0.14-2.10.aarch64.rpm"
RPM_HASH = "5f38021a007d98a249ea82db6bff12b8cdfc73ded5ff38882655976fe554cac277b74084fe5cd0fe1fc66b56a4862145fb4a8d0aabce1d967590d9c7b802642f"

RPROVIDES:${PN} += "libnative-platform-curses.so \
libnative-platform.so \
mvn-net.rubygrapefruit-native-platform \
native-platform"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
