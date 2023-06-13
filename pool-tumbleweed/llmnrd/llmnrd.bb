SUMMARY = "Link-Local Multicast Resolution (LLMNR) Daemon"
DESCRIPTION = "llmnrd is a daemon implementing the Link-Local Multicast Name Resolution (LLMNR) \
protocol according to RFC 4795. It uses the Netlink kernel interface. \
 \
llmnrd will respond to name resolution queries sent by Windows clients in \
networks where no DNS server is available. It supports both IPv4 and IPv6."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "llmnrd-0.7-4.3.aarch64.rpm"
RPM_HASH = "da41cca39aeffb59ba4f0015c1baae5d480e1a3fcbad0b82db637ca0e987db5b487fade33dcc47d85294de8d9849793ff813ad0ea5857a8853429779aeb6d7e2"

RPROVIDES:${PN} += "config(llmnrd) \
llmnrd \
llmnrd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
