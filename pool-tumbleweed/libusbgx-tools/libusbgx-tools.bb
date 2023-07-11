SUMMARY = "Utilities to show and configure USB gadget devices"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality. \
 \
This subpackage contains utilities to display and configure USB \
gadget devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libusbgx-tools-0.2.0-1.14.aarch64.rpm"
RPM_HASH = "1561846fa4e4a65232d2e00349f70612897a52e5c8e70b2e8bb3ebf604f7d51c3ca98a5ad06912e648d71e5826860bf908879c9f712182eb7e219d81114cd128"

RPROVIDES:${PN} += "libusbgx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbgx.so.2"

inherit rpm
