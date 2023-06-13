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

RPM_NAME = "dbench4-4.0-4.13.aarch64.rpm"
RPM_HASH = "7ae5dd764c9627c2749d0cebea706c434ae077db415d6d848287df9e27840ffb1bb316ebc3537335530ccb453e759ec0c40693bc63a125fe38ca6feb0bb6469c"

RPROVIDES:${PN} += "dbench4 \
dbench4(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
