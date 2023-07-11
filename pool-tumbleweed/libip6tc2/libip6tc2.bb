SUMMARY = "Library for the ip_tables low-level ruleset generation and parsing (IPv6)"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel. \
This package contains the iptc IPv6 API."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libip6tc2-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "52d8a2d909346b66031ce1ad2b75336104a030eb52d0ce15d35881fd24860bdbab4a55a55dfd3581f02e03d99f30951f074dc08f9fd5b63f9a57c489f935c315"

RPROVIDES:${PN} += "libip6tc.so.2 \
libip6tc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
