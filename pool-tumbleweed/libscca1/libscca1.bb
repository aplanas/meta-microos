SUMMARY = "Library to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "libscca1-20230716-2.1.aarch64.rpm"
RPM_HASH = "f1b58f78f4693a6fadd0092b9d03800f8ae95d981446a0f9f8604deac052575dae61d21886d072ec408a3ee42fd2fe49777cb5e271156c99ee5d5e3843a7b3e5"

RPROVIDES:${PN} += "libscca.so.1 \
libscca1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
