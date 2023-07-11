SUMMARY = "Utilities to inspect SGI X File Systems (XFS)"
DESCRIPTION = "This subpackage provides the utilities from libfsxfs, which allows for \
reading SGI X File Systems (XFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-tools-20220829-3.10.aarch64.rpm"
RPM_HASH = "a552fb36f2e9fa53dc15c583baf16cd783bfada0288c51344708581f62566e1f468ceeb536923e3d2bf551867176ae39465a5056b7cdbf970b0266e10cb213f9"

RPROVIDES:${PN} += "libfsxfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfsxfs.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
