SUMMARY = "Library for the ip_tables low-level ruleset generation and parsing (IPv4)"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel. \
This package contains the iptc IPv4 API."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libip4tc2-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "c9b158a6d84dd9bc4d6457d174b1e1003b12d2694579be69427862afb0d62ed79e998513aeb52f6d23df8c463b1a211fa637f93deff3f131d5e25e103895788f"

RPROVIDES:${PN} += "libip4tc.so.2 \
libip4tc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
