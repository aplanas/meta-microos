SUMMARY = "PGM Reliable Multicast Protocol library"
DESCRIPTION = "OpenPGM is an implementation of the Pragmatic General Multicast (PGM) \
specification in RFC 3208. PGM is a reliable and scalable multicast protocol \
that enables receivers to detect loss, request retransmission of lost data, or \
notify an application of unrecoverable loss."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.128"

RPM_NAME = "libpgm-5_3-0-5.3.128-2.1.aarch64.rpm"
RPM_HASH = "bd8152dcd71a26450c2ce4b3b835338c5084567209854be7117c4739440e0a3df5274c9e4f0e1b67e99809a91178ddd3a3821870132a6d7807b9d43e3fa6a7ff"

RPROVIDES:${PN} += "libpgm-5-3-0 \
libpgm-5.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
