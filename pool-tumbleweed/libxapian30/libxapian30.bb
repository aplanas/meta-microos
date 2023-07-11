SUMMARY = "Xapian search engine libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "libxapian30-1.4.21-1.4.aarch64.rpm"
RPM_HASH = "a9298d3f7e49617a3f61d0a2f1f186ba708e68b7b46bca5482c020abcd1ae0dfb2364acb4b4d47f0c2ef940bb607ecf1da836430dffeafeac95cc8e2c35a2f69"

RPROVIDES:${PN} += "libxapian.so.30 \
libxapian30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
