SUMMARY = "Library for C path functions"
DESCRIPTION = "A library for C path functions. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcpath1-20220108-4.5.aarch64.rpm"
RPM_HASH = "b4711ca57ef7aa92c8de2d7050777f834a259e8a27fb55e331f16695fefeb0325e4508d408dbe549ec20cad9acd8dd3848c03497489fc30b1c44b8907fa004b3"

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
