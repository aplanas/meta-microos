SUMMARY = "Kea utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-util68-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "93ba6b0e6f17bb28ad5548de88da0b40b5c72e9121e4643b62497ef451542b72413450f636c54211d56946a7412a8c200288353af88a8b4fb18be895c4075442"

RPROVIDES:${PN} += "libkea-util.so.68 \
libkea-util68"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.23 \
libstdc++.so.6"

inherit rpm
