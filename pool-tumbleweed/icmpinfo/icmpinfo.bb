SUMMARY = "A Tool for Looking at ICMP Messages"
DESCRIPTION = "A tool for looking at the ICMP messages received on the running host."
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "icmpinfo-1.11-715.22.aarch64.rpm"
RPM_HASH = "8eb81d71b76467f683a2bd1ea5ef598d5754dbb782b1fc017409fe82a53e60e59c19feb5fc44903dc18dcb5f9ca49de64734af73b43d65f3f854f7c43ec519b3"

RPROVIDES:${PN} += "icmpinfo \
icmpinfo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnss_usrfiles2 \
netcfg"

inherit rpm
