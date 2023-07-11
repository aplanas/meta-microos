SUMMARY = "Libraries for flex"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text. \
 \
This package contains libraries for using flex."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "libfl2-2.6.4-6.21.aarch64.rpm"
RPM_HASH = "ff83730acfdcfb62debd61a69d5f348274f7b0091d7763d0826351d9fe3991b143de65795afbe744e34ebea8d7ab57cee4acadc20c9c7246300bd7b689750fe9"

RPROVIDES:${PN} += "libfl.so.2 \
libfl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
