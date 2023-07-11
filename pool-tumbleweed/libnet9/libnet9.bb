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

RPM_NAME = "libnet9-1.2-3.9.aarch64.rpm"
RPM_HASH = "f55a16a51bc0bd49cb5e5ec25d7040effe02011d206b7bc4c5a10deb3ba901d516e608adf6888e8860bc3c7ac6c34099cbd278474fbebc87198acf322b7024de"

RPROVIDES:${PN} += "libnet.so.9 \
libnet9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
