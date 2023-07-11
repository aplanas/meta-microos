SUMMARY = "File-based build system"
DESCRIPTION = "Tup is a file-based build system. \
It inputs a list of file changes and a directed acyclic graph (DAG), \
then processes the DAG to execute the appropriate commands required \
to update dependent files."
LICENSE = "GPL-2.0-only"

PV = "0.7.11"

RPM_NAME = "tup-0.7.11-1.11.aarch64.rpm"
RPM_HASH = "80154f406ce1380e7846bf8a6ddd58282e7a23c802eb4f995d4e0d838a018ff2925fc0400aaff6f384f13eeb421470bf498dc9fad683f04acecd941a74940a29"

RPROVIDES:${PN} += "tup"

RDEPENDS:${PN} += "libc.so.6 \
libfuse3.so.3 \
libm.so.6 \
libpcre.so.1 \
vim"

inherit rpm
