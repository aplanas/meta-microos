SUMMARY = "Development files for ipset extensions"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set."
LICENSE = "GPL-2.0-only"

PV = "7.17"

RPM_NAME = "ipset-devel-7.17-1.2.aarch64.rpm"
RPM_HASH = "39f854f1fb4e67ade81f52ae8d691af87c8f214fa6f76d1ae4b6dd714fb92a411f2cd88e6f8a786572c83b837bebc58c60740b1425a1c34f97552e05252ec94e"

RPROVIDES:${PN} += "ipset-devel \
ipset-devel(aarch-64) \
pkgconfig(libipset)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipset13 \
pkgconfig(libmnl)"

inherit rpm
