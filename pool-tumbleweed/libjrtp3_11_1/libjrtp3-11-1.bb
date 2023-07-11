SUMMARY = "An object-oriented RTP library written in C++"
DESCRIPTION = "JRTPLIB is an object-oriented library written in C++ for making use of \
the Real-time Transport Protocol (RTP) as described in RFC 3550."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "libjrtp3_11_1-3.11.1-1.21.aarch64.rpm"
RPM_HASH = "8a6f05c83ca8be02d2a87f53ad090fd99ab61bbe2fd39eac70b4c3fdc09040ba823f7d352cde06d18c46578d62626c119fb891cfa226ffb316cb9986107f763b"

RPROVIDES:${PN} += "libjrtp.so.3.11.1 \
libjrtp3-11-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjthread.so.1.3.3 \
libsrtp.so.1 \
libstdc++.so.6"

inherit rpm
