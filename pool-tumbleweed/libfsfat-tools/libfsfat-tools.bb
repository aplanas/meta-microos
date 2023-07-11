SUMMARY = "Utilities to inspect FAT file systems"
DESCRIPTION = "This subpackage provides the utilities from libfsfat, which allows for \
reading FAT File Systems."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-tools-20220925-3.11.aarch64.rpm"
RPM_HASH = "267728a95a4f900fa2f3da40ad7980362a504bccba668ee2ec643c5783eaa66d45f244a83ae067c10722a2db16ae33170c927cc7b028898c9f3bbdcb127b2013"

RPROVIDES:${PN} += "libfsfat-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfsfat.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
