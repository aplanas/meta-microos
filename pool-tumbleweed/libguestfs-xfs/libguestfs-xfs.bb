SUMMARY = "XFS support for libguestfs"
DESCRIPTION = "This adds XFS support to libguestfs.  Install it if you want to process \
disk images containing XFS."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-xfs-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "4df8492533f47d44468aaca932f28b740037a161973b90d23b3c0fbeeb959627760c65e0b65147be16cbc7c8624755a4bc321cf84d70c860b45281c3617b01f6"

RPROVIDES:${PN} += "libguestfs-xfs"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
