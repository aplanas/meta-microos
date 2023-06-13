SUMMARY = "Content Addressable Data Synchronization Tool"
DESCRIPTION = "casync provides a way to efficiently transfer files which change over \
time over the Internet. It will split a given set into a git-inspired \
content-addressable set of smaller compressed chunks, which can then \
be conveniently transferred using HTTP. On the receiving side, these \
chunks will be uncompressed and merged together to recreate the \
original data. When the original data is modified, only the new chunks \
have to be transferred during an update."
LICENSE = "LGPL-2.1-or-later"

PV = "2+git20201210.bd8898e"

RPM_NAME = "casync-2+git20201210.bd8898e-1.12.aarch64.rpm"
RPM_HASH = "baf3dbde6c5105522706e3bab22967e1da7e9212965e37b1f4d373f061e8a65af9e53d8908bd6978495a307f1edc6a1ac04783446f717ed619de941b5b90c5b0"

RPROVIDES:${PN} += "casync \
casync(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libfuse.so.2()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libselinux.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
