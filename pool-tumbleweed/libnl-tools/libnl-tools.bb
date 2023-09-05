SUMMARY = "Command line utilities to directly work with Netlink"
DESCRIPTION = "Various test program with which the functionality of libnl is \
demonstrated."
LICENSE = "GPL-2.0-only"

PV = "3.8.0"

RPM_NAME = "libnl-tools-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "d40600c6d3f4b7e9368a908eda383b7afbfab37331253c057d5cec838858857fddd9a9ff5f2b3a570ae7ccca0160cbdb18f6ceeec92325a95b8dc18e554bb34c"

RPROVIDES:${PN} += "libnl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-idiag-3.so.200 \
libnl-nf-3.so.200 \
libnl-route-3.so.200"

inherit rpm
