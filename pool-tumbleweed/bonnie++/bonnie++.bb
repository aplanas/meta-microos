SUMMARY = "A Bonnie-Like File System Benchmark"
DESCRIPTION = "Bonnie++ is a benchmark suite aimed at performing a number of simple \
hard drive and file system performance tests."
LICENSE = "MIT"

PV = "2.00a"

RPM_NAME = "bonnie++-2.00a-1.3.aarch64.rpm"
RPM_HASH = "bc53f13ce9f4ea9cc650ce041c778d2d247c9d033678f89eea3b2de4e60380ca547860d54c9a6541b15712e309d5c201940916a5eebe043af9cd52b35ae0dee0"

RPROVIDES:${PN} += "bonnie++"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
