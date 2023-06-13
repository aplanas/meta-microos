SUMMARY = "A C Library for Portable Packet Creation"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. It provides a portable framework for low-level network packet \
writing and handling. Libnet includes packet creation at the IP layer \
and at the link layer as well as a host of supplementary and \
complementary functionality. Libnet is very useful for writing network \
tools and network test code. See the man page and sample test code for \
more detailed information."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libnet9-1.2-3.8.aarch64.rpm"
RPM_HASH = "abbc28d9f841e44883f3771000c36bb0f4d87e89c78f11584ce9524836e800a44dc56aabc7f362a45faf498fbb3a60f752fa270712848cbe806d3e397a85dd0b"

RPROVIDES:${PN} += "libnet.so.9()(64bit) \
libnet9 \
libnet9(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
