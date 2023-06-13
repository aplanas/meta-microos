SUMMARY = "File-based build system"
DESCRIPTION = "Tup is a file-based build system. \
It inputs a list of file changes and a directed acyclic graph (DAG), \
then processes the DAG to execute the appropriate commands required \
to update dependent files."
LICENSE = "GPL-2.0-only"

PV = "0.7.11"

RPM_NAME = "tup-0.7.11-1.10.aarch64.rpm"
RPM_HASH = "babcb00391b0df0051b1729c82a39e380a8ba40bf168bc7bb519c30edcf4b575707c0a9e0d2e113477f53e86822d568cb59a94e03e5a0ea1a93a4614f889645d"

RPROVIDES:${PN} += "tup \
tup(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libfuse3.so.3()(64bit) \
libfuse3.so.3(FUSE_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcre.so.1()(64bit) \
vim"

inherit rpm
