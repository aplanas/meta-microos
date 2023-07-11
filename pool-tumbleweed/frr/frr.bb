SUMMARY = "FRRouting Routing daemon"
DESCRIPTION = "FRR is free software which manages TCP/IP based routing protocols. \
It supports BGP4, BGP4+, OSPFv2, OSPFv3, IS-IS, RIPv1, RIPv2, RIPng, \
PIM and LDP as well as the IPv6 versions of these. \
 \
FRR is a fork of Quagga.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "frr-8.4-4.2.aarch64.rpm"
RPM_HASH = "5cddc4f8b68696b69720a2174da344a1c0a748912a1cdf7e4b1b9d4b8602dcecd2cc636331ce5995f6715fbeae6a1d5b1ce81de10d2696071ef1755b534674fb"

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
