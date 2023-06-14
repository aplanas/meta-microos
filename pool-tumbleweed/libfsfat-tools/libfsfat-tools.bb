SUMMARY = "Utilities to inspect FAT file systems"
DESCRIPTION = "This subpackage provides the utilities from libfsfat, which allows for \
reading FAT File Systems."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-tools-20220925-3.9.aarch64.rpm"
RPM_HASH = "31ccac13466061c9b27dbb000d8546ff8e432c08298125a002b901187652f47a1112d241cae765049d3854c31b7066f34495108137d2a499c13d73a574e3f5d4"

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
