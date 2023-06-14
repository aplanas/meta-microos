SUMMARY = "Real-time Transport Protocol Stack"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889)."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libortp15-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "3ac3a369bd13206064d26d20ec36a79b351e2a39d1b7c3fb6fcd1c0362541a728fe3f5d14af556ad34e6e7d5905d780937a4e483fcc4807670124033e455de8e"

RPROVIDES:${PN} += "libortp.so.15 \
libortp15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
