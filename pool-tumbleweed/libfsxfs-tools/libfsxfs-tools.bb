SUMMARY = "Utilities to inspect SGI X File Systems (XFS)"
DESCRIPTION = "This subpackage provides the utilities from libfsxfs, which allows for \
reading SGI X File Systems (XFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-tools-20220829-4.1.aarch64.rpm"
RPM_HASH = "e078fa3e7b14917e02543b3425fe88c7cf449c91092a5c87d15713251a0a6befe3e1f2240d6e1b94bcf128baa71d014c33d4402905a961ebdf5599d6f9ce6c79"

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
