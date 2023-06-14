SUMMARY = "Utilities to inspect SGI X File Systems (XFS)"
DESCRIPTION = "This subpackage provides the utilities from libfsxfs, which allows for \
reading SGI X File Systems (XFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-tools-20220829-3.8.aarch64.rpm"
RPM_HASH = "80fbfcf177793ac7c73784a9e0f478400ba3a559c1b010546c792f6914ef3fc13f3ca7c4c95e6bfdc9af3f5358c70f532470d974840e1f80faa5dfb4728f3dac"

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
