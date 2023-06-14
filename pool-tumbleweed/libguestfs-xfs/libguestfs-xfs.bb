SUMMARY = "XFS support for libguestfs"
DESCRIPTION = "This adds XFS support to libguestfs.  Install it if you want to process \
disk images containing XFS."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-xfs-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "77e969c2848852de363e63830fee10a357175fc5ba9b1f7c5b51ac1db75b745aa4ccffb84a7d42c4cb0a76873805ac1109eba060060962903cb3d65f5459103d"

RPROVIDES:${PN} += "libguestfs-xfs"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
