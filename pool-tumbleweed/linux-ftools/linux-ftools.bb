SUMMARY = "Linux command line tools for fallocate, fincore, fadvise, etc"
DESCRIPTION = "These are tools designed for working with modern linux system calls including, \
mincore, fadvise, etc. \
 \
We designed these primarily to work in high performance environments to \
determine information about the running kernel, improve system performance, and \
debug performance problems."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "linux-ftools-1.3-4.24.aarch64.rpm"
RPM_HASH = "a001775fd06a55420abe02773db128c768a5c1ed6a3dfa31ce516a4a9a3f19d894e6c338f2a782b45eeb26d38c8bc0e807efb58b108b3fcf195945251eb92fff"

RPROVIDES:${PN} += "linux-ftools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
