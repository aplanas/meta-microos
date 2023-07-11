SUMMARY = "Development files for ipset extensions"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set."
LICENSE = "GPL-2.0-only"

PV = "7.17"

RPM_NAME = "ipset-devel-7.17-1.3.aarch64.rpm"
RPM_HASH = "8114ae7e5835dafb3bc07750339ea283d19e25211bd670726f1741fdec7ad8ab30ad31dce6a5d95cb8b5662be1a8b1bc736b8d56d3db1ec1768f7691610fe981"

RPROVIDES:${PN} += "ipset-devel \
pkgconfig-libipset"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipset13 \
pkgconfig-libmnl"

inherit rpm
