SUMMARY = "Shared library for ecryptfs-utils"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "libecryptfs1-111-7.4.aarch64.rpm"
RPM_HASH = "c43b359548da1e4657d92664b6fad615ddf0a6c5d9c9c399b7cbf920ac96a41f3a8e4eda66910a5b5a56bbc9c26d6bd380cb8d498287cd11cf53ff70063d3abe"

RPROVIDES:${PN} += "libecryptfs.so.1()(64bit) \
libecryptfs1 \
libecryptfs1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkeyutils.so.1()(64bit) \
libnss3.so()(64bit)"

inherit rpm
