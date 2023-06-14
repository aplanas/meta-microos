SUMMARY = "Algorithm for graph isomorphism testing and automorphism group computation"
DESCRIPTION = "The 'conauto' algorithm tests whether two graphs are isomorphic. This is the \
reference implementation."
LICENSE = "GPL-3.0-or-later"

PV = "2.03"

RPM_NAME = "conauto-2.03-1.10.aarch64.rpm"
RPM_HASH = "229897e8d5ca36668afb6f762fad77a8ce7302ddb1609a3b41e016e2b46ce9ccda53be82b3ccab3082aa7330ceb6f6acb31abacf14c24fcf126656f6010376a2"

RPROVIDES:${PN} += "conauto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
