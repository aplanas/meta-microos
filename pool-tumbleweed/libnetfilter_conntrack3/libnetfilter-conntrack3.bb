SUMMARY = "Userspace library for the in-kernel connection tracking state table"
DESCRIPTION = "libnetfilter_conntrack is a userspace library providing a programming \
interface (API) to the in-kernel connection tracking state table. The \
library libnetfilter_conntrack has been previously known as \
libnfnetlink_conntrack and libctnetlink. This library is currently \
used by conntrack-tools among many other applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.9"

RPM_NAME = "libnetfilter_conntrack3-1.0.9-1.7.aarch64.rpm"
RPM_HASH = "623cb9650035c08bc232f6a5412743703e13ecb6afde98fb0841a8f39a02266e675d97b63721fe1062c83066e84fb182d2e39c3a21c00c6609d803664712ff78"

RPROVIDES:${PN} += "libnetfilter-conntrack.so.3 \
libnetfilter-conntrack3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnfnetlink.so.0"

inherit rpm
