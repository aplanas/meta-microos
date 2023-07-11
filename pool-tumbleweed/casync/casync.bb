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

RPM_NAME = "casync-2+git20201210.bd8898e-1.13.aarch64.rpm"
RPM_HASH = "faef346ef21d2fba5dfc8347396768d96ace234db0984e77ae351da10f94e3a36725f2c9c02629ec5a5431a2b35d225756a10e7e0a43ef03901465aafd32418c"

RPROVIDES:${PN} += "casync"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfuse.so.2 \
liblzma.so.5 \
libm.so.6 \
libselinux.so.1 \
libudev.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
