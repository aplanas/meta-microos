SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.11.1"

RPM_NAME = "python39-pygit2-1.11.1-2.5.aarch64.rpm"
RPM_HASH = "c3a6e648dc8e2901bcfcc9d22040faf062c3b15296113a1c951664341deee4be922653c8248fe30a2e3ab4cfa83ece5e820a62c0e68652f81e8df3b377ee5352"

RPROVIDES:${PN} += "python3.9dist-pygit2 \
python39-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.6 \
python-abi \
python39-cached-property \
python39-cffi"

inherit rpm
