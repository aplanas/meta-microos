SUMMARY = "Library for C path functions"
DESCRIPTION = "A library for C path functions. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcpath1-20220108-4.6.aarch64.rpm"
RPM_HASH = "83797c54c9ce0a771ac86e8a2a67ded1d726cd02d403eadea83e3066f4e0e8f22658ba493bd4f2f49c7a1fe62c674a81152ee03df4e8579ec2a8a4b765fd800a"

RPROVIDES:${PN} += "libcpath.so.1 \
libcpath1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcsplit.so.1 \
libuna.so.1"

inherit rpm
