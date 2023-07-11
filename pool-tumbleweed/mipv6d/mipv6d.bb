SUMMARY = "MIPL - Mobile IPv6 for Linux"
DESCRIPTION = "MIPL Mobile IPv6 for Linux is an implementation of the Mobility Support \
in IP version 6 (RFC 3775). \
 \
This user space part works together with Mobile IPv6 enabled Linux \
kernels.  See INSTALL and any other documents referred there for \
installation instructions and required kernel compile options. \
 \
MIPL Mobile IPv6 for Linux has been developed in the GO-Core Project at \
the Helsinki University of Technology.	See AUTHORS for core \
development team and THANKS for complete listing of contributors."
LICENSE = "GPL-2.0"

PV = "2.0.2.umip.0.4"

RPM_NAME = "mipv6d-2.0.2.umip.0.4-28.11.aarch64.rpm"
RPM_HASH = "d25336e3573e6cf7c1f9ff0589874b0d3beaac2578ef2ec62504f1355ad5e980330b4187a5f7fc7f1571670bec211546f45b2592646b120db1e932c6e06a88b2"

RPROVIDES:${PN} += "config-mipv6d \
mipv6d"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
