SUMMARY = "FRRouting Routing daemon"
DESCRIPTION = "FRR is free software which manages TCP/IP based routing protocols. \
It supports BGP4, BGP4+, OSPFv2, OSPFv3, IS-IS, RIPv1, RIPv2, RIPng, \
PIM and LDP as well as the IPv6 versions of these. \
 \
FRR is a fork of Quagga.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "frr-8.4-5.1.aarch64.rpm"
RPM_HASH = "18453eab4610d4219aa84def183e0308f42ad6bdb9b50f0a5d7dc82f4dc328a4acc22885295d50d72a8a8991c85acc416a51387dbd5247ca6ac43fbe3fa9456b"

RPROVIDES:${PN} += "config-frr \
frr \
zebra"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
libc.so.6 \
libcrypto.so.3 \
libfrr-pb.so.0 \
libfrr.so.0 \
libfrrcares.so.0 \
libfrrfpm-pb.so.0 \
libjson-c.so.5 \
libm.so.6 \
libmlag-pb.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libprotobuf-c.so.1 \
libreadline.so.8 \
librtr.so.0 \
shadow"

inherit rpm
