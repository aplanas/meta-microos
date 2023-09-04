SUMMARY = "Python3 bindings for the libsolv library"
DESCRIPTION = "Python3 bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "python3-solv-0.7.24-1.4.aarch64.rpm"
RPM_HASH = "3fdd6e04a9d3bb49b018f7c0e6d1d3032d9707877158706a7c11a68b50eddaa77d440bed68a32bae20102091c90e535d9d2715bcf4206d0d0d03518927ad6f92"

RPROVIDES:${PN} += "python3-solv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
python-abi"

inherit rpm
