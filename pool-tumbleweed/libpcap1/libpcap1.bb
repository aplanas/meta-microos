SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap is a library used by packet sniffer programs. It provides an \
interface for them to capture and analyze packets from network devices. \
This package is only needed if you plan to compile or write such a \
program yourself."
LICENSE = "BSD-3-Clause"

PV = "1.10.4"

RPM_NAME = "libpcap1-1.10.4-1.2.aarch64.rpm"
RPM_HASH = "9698f69c2e93067ceb28149e7a20b0fe3d136d0eb490e4c8471dd979557796857dec20fbca012ab30c952763f46c00a05f0c1433043a63246c9d58014f869021"

RPROVIDES:${PN} += "libpcap \
libpcap.so.1 \
libpcap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
