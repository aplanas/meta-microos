SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap is a library used by packet sniffer programs. It provides an \
interface for them to capture and analyze packets from network devices. \
This package is only needed if you plan to compile or write such a \
program yourself."
LICENSE = "BSD-3-Clause"

PV = "1.10.4"

RPM_NAME = "libpcap1-1.10.4-1.1.aarch64.rpm"
RPM_HASH = "1f93a5a3fd1033b1927b93d7d28691383f3b13f86c119d78e2ae932b38089cc859d3e6540fe949a49836104f89f94c405a67ee1a7d355c393ba6cacdc0c1d353"

RPROVIDES:${PN} += "libpcap \
libpcap.so.1()(64bit) \
libpcap1 \
libpcap1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit)"

inherit rpm
