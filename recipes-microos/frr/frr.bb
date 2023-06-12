SUMMARY = "FRRouting Routing daemon"
DESCRIPTION = "FRR is free software which manages TCP/IP based routing protocols. \
It supports BGP4, BGP4+, OSPFv2, OSPFv3, IS-IS, RIPv1, RIPv2, RIPng, \
PIM and LDP as well as the IPv6 versions of these. \
 \
FRR is a fork of Quagga.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "frr-8.4-4.1.aarch64.rpm"
RPM_HASH = "211e37ff8964fa6749e6c6332510a4495c98a3cdbd2d823792d51fb5682671ff46e61e746e72315b40de34ca996b4359c55e95f808ca5a406dd76537bf2ea13d"

RPROVIDES:${PN} += "config(frr) \
frr \
frr(aarch-64) \
zebra"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfrr.so.0()(64bit) \
libfrr_pb.so.0()(64bit) \
libfrrcares.so.0()(64bit) \
libfrrfpm_pb.so.0()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmlag_pb.so.0()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam_misc.so.0()(64bit) \
libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) \
libprotobuf-c.so.1()(64bit) \
libprotobuf-c.so.1(LIBPROTOBUF_C_1.3.0)(64bit) \
libreadline.so.8()(64bit) \
libreadline.so.8(READLINE_7.0)(64bit) \
librtr.so.0()(64bit) \
shadow"

inherit rpm
