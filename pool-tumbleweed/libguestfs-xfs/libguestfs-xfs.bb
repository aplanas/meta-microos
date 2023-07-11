SUMMARY = "XFS support for libguestfs"
DESCRIPTION = "This adds XFS support to libguestfs.  Install it if you want to process \
disk images containing XFS."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-xfs-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "f7b6d3f4586709b694fc79dcd1b3203c7ee2f2eba82b05ef7dd9f2edcdf65a41a0f3035f6b8689f0f83aafa2e8ecd10b8ece6abbfd66714227dc211399878782"

RPROVIDES:${PN} += "libguestfs-xfs"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
