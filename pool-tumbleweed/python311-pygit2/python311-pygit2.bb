SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.11.1"

RPM_NAME = "python311-pygit2-1.11.1-2.2.aarch64.rpm"
RPM_HASH = "2a6f0e69fc7ce12817742d1e0aa22606b801c2ce8d60ae6789ffe40b3d5bbfb8ea0c41986dc1a925b83f2c957013f9bb4f8e2bbbff6ea47157acf8aa1dfe5047"

RPROVIDES:${PN} += "python3.11dist-pygit2 \
python311-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.6 \
python-abi \
python311-cached-property \
python311-cffi"

inherit rpm
