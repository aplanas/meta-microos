SUMMARY = "File System Benchmark Similar to Netbench"
DESCRIPTION = "Dbench is a file system benchmark that generates load patterns similar \
to those of the commercial Netbench benchmark, but without requiring a \
lab of Windows load generators to run. It is now considered a de facto \
standard for generating load on the Linux VFS. \
 \
This is version 4 of dbench that does not produce results comparable \
with older versions."
LICENSE = "GPL-3.0-only"

PV = "4.0"

RPM_NAME = "dbench4-4.0-4.14.aarch64.rpm"
RPM_HASH = "119e0564af0991d654e50736644fba31b10a028e5c388c53677d4d9226f7029d0dffa3b61a16f25a987fcf9cfa2c44ccad6def94aa185ad1017bd7eae1a90e77"

RPROVIDES:${PN} += "dbench4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0"

inherit rpm
