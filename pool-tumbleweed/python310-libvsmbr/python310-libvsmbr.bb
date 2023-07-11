SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python310-libvsmbr-20210509-4.9.aarch64.rpm"
RPM_HASH = "bcc987124c6dd6ac7fe5082c48049da7bcd57a61812447d6d54029fc97e278d4f1bfe5dc25439232eb653d6ce8deedc3015bc9b1362196d04868268ffb119b22"

RPROVIDES:${PN} += "python310-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
