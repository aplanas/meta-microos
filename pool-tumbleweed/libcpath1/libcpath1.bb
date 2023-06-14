SUMMARY = "Library for C path functions"
DESCRIPTION = "A library for C path functions. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcpath1-20220108-4.3.aarch64.rpm"
RPM_HASH = "d4540d9ecf168bc1a237743d13af06e379c5a5d51a8b0e53ca7cd1605e776acb25cebcfae269a70f262438b73a1dbc7b477a176bda8a9ac0c6cfc82c57cc3cbb"

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
