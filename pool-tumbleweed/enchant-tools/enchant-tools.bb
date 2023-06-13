SUMMARY = "Command line tools for the Enchant spell checking library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides command-line tools to interact with enchant."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-tools-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "95a6d8bdf3f328de953a7159aa92e4cd52b913c10bf6ba1864ac5dbd271f9b335c7e9b00920d92d3876e58fff77bd111b5593a9bb9021f64b206c001d1a08fd2"

RPROVIDES:${PN} += "enchant-tools \
enchant-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libenchant-2.so.2()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
