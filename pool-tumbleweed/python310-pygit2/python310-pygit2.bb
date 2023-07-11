SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.11.1"

RPM_NAME = "python310-pygit2-1.11.1-2.5.aarch64.rpm"
RPM_HASH = "ac67026b1ca10e70b4db0af23bc38476624062dfe28ce66b80d8f1ad9c987078aeb5dba90ffd286d2676986bc97cb3c409e7e9323a61df7ca2e1f6197d57bbdb"

RPROVIDES:${PN} += "python3.10dist-pygit2 \
python310-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.6 \
python-abi \
python310-cached-property \
python310-cffi"

inherit rpm
