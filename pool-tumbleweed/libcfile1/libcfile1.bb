SUMMARY = "Library for C file functions"
DESCRIPTION = "A library for C file functions. Part of the libyal library collection."
LICENSE = "LGPL-3.0-or-later"

PV = "20220106"

RPM_NAME = "libcfile1-20220106-2.3.aarch64.rpm"
RPM_HASH = "298a3beadfa9d3a73fa2fc26d74309900a55b07d942db567493b1a99d6231443d201b64aced2f799cccb4dd58a7afb21f0a29fd37202e032b1301deadc41b830"

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
