SUMMARY = "Visualizer for estimated instantaneous bandwidth on USB buses and devices"
DESCRIPTION = "A top-like utility that shows an estimated instantaneous bandwidth on USB buses and devices. \
 \
Requires the usbmon kernel module to be loaded."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "usbtop-1.0-2.19.aarch64.rpm"
RPM_HASH = "dbb1c3d8efd6d67724b8a4c0b16084683c2f63326316687d8459231f9656e01c628ef9a2e8b299bbe69701271ed7db043943948683447f96b9bd8ecad8d153cf"

RPROVIDES:${PN} += "usbtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcap.so.1 \
libstdc++.so.6"

inherit rpm
