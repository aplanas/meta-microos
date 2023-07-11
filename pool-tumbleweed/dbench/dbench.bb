SUMMARY = "File System Benchmark Similar to Netbench"
DESCRIPTION = "Dbench is a file system benchmark that generates load patterns similar \
to those of the commercial Netbench benchmark, but without requiring a \
lab of Windows load generators to run. It is now considered a de facto \
standard for generating load on the Linux VFS."
LICENSE = "GPL-2.0+"

PV = "3.04"

RPM_NAME = "dbench-3.04-169.28.aarch64.rpm"
RPM_HASH = "ca8216c49fbb6d144542fc9e14e3afb0c1f4c08d80220dcf5550523b49f006e788dd829881f242df6c53de0cc95d5cdafeda85a0819ec805cf0a1f4ddb75db29"

RPROVIDES:${PN} += "dbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
