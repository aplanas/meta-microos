SUMMARY = "Tools Used for the Macintosh's Hierarchical File System"
DESCRIPTION = "HFS is the Hierarchical File System used on modern Macintosh computers. \
With this package, you can read and write Macintosh-formatted media, \
such as floppy disks, CD-ROMs, and SCSI hard disks on most UNIX \
platforms. You can also format raw media into an HFS volume."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "hfsutils-3.2.6-1245.14.aarch64.rpm"
RPM_HASH = "3cef51b788bcc58fc1569925135a423a38198f3066d1ab7b3001893323035e08c91ad72f712c48b7a5c66b3682b4522714c284e8961002d7a3b6f238e23b5ac1"

RPROVIDES:${PN} += "hfsutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
