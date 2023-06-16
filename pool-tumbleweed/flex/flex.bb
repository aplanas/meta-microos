SUMMARY = "Fast Lexical Analyzer Generator"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "flex-2.6.4-6.20.aarch64.rpm"
RPM_HASH = "10043ab14458619d8f591d3202bd5defa886f737c4cfef3df220778665f83898d24390f00e86c460bea3af5acd4cd25822c44973227a53f3c775c7cc76539963"

RPROVIDES:${PN} += "flex"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfl-devel \
libm.so.6 \
m4"

inherit rpm
