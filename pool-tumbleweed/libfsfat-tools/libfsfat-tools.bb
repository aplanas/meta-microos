SUMMARY = "Utilities to inspect FAT file systems"
DESCRIPTION = "This subpackage provides the utilities from libfsfat, which allows for \
reading FAT File Systems."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-tools-20220925-4.2.aarch64.rpm"
RPM_HASH = "1f79b89736abd48a43a175fbd8840e47917fa8ea871482fd5e31d17d55624e1675cf8d2f8e9a29b9e3ed6d63985b4ffbc5a8f4e91a841006836e9d96578ccce7"

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
