SUMMARY = "File System Benchmark Similar to Netbench"
DESCRIPTION = "Dbench is a file system benchmark that generates load patterns similar \
to those of the commercial Netbench benchmark, but without requiring a \
lab of Windows load generators to run. It is now considered a de facto \
standard for generating load on the Linux VFS."
LICENSE = "GPL-2.0+"

PV = "3.04"

RPM_NAME = "dbench-3.04-169.27.aarch64.rpm"
RPM_HASH = "24a549ab4136598d79d2759be202006bd0b54fcc427bc55a7410b70cfb59ef2afa4e4ed025eac1b91dcff1720e092591705cf2984d34927f8a6d0a468d4e7726"

RPROVIDES:${PN} += "dbench \
dbench(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
