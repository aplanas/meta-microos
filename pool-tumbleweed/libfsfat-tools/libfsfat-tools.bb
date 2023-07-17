SUMMARY = "Utilities to inspect FAT file systems"
DESCRIPTION = "This subpackage provides the utilities from libfsfat, which allows for \
reading FAT File Systems."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-tools-20220925-3.12.aarch64.rpm"
RPM_HASH = "99ddd3b2c23c7bb28d4bc2fb902619ccd312cf322c20e2dd503a3fe2f94d80507279604cceb86a5e7e05378cdb63006a444fffe39ef84823994048868627d2f1"

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
