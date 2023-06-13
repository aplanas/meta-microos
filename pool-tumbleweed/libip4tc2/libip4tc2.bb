SUMMARY = "Library for the ip_tables low-level ruleset generation and parsing (IPv4)"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel. \
This package contains the iptc IPv4 API."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libip4tc2-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "ffc13eb5ecbaff1d8758ee035b81a59ebe9b614fc30c5084dd7ff5b25d2817289bf804523dba82ca1848419776fc9631a23bbc23c67a68302ceb496c99b980bd"

RPROVIDES:${PN} += "libip4tc.so.2()(64bit) \
libip4tc2 \
libip4tc2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit)"

inherit rpm
