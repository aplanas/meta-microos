SUMMARY = "Utilities to inspect SGI X File Systems (XFS)"
DESCRIPTION = "This subpackage provides the utilities from libfsxfs, which allows for \
reading SGI X File Systems (XFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-tools-20220829-3.11.aarch64.rpm"
RPM_HASH = "b7d3ace54e51e853b62eb9aa35ccf43edb0029a05bcbd67cb8472b3b1c265339be62dd87301a324f6f21569305418cc513a07c7c8d0dad83bd5da7a98fa45623"

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
