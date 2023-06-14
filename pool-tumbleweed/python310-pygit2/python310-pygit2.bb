SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.11.1"

RPM_NAME = "python310-pygit2-1.11.1-2.2.aarch64.rpm"
RPM_HASH = "33a93c82a400455cbbccb2fe32c976b2213160d05eb82582188502ef84b59dec3c2805409f71f42fc3a6e9ae706414a3a14491378a4e0b439fdc3af5a19f2c74"

RPROVIDES:${PN} += "python3-pygit2 \
python3.10dist-pygit2 \
python310-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.6 \
python-abi \
python310-cached-property \
python310-cffi"

inherit rpm
