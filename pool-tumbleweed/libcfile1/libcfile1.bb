SUMMARY = "Library for C file functions"
DESCRIPTION = "A library for C file functions. Part of the libyal library collection."
LICENSE = "LGPL-3.0-or-later"

PV = "20220106"

RPM_NAME = "libcfile1-20220106-2.5.aarch64.rpm"
RPM_HASH = "c95b5ab26004c2582a95754c844446428d15a5119b8386f7072befe9bb52e56ccecefa03a2d8e53cfae4b24df8c476bd664fa82295e5f10ed03d3a255e186b3d"

RPROVIDES:${PN} += "libcfile.so.1 \
libcfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
