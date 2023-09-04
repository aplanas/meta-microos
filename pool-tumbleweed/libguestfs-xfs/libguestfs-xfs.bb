SUMMARY = "XFS support for libguestfs"
DESCRIPTION = "This adds XFS support to libguestfs.  Install it if you want to process \
disk images containing XFS."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-xfs-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "81aa4e9589dc0704a04c3f51261485fd5652c500f96ca8b959d874bcb70272f1399bfccd1e9a376f776158d930591fb60b4cbaba0a645e594517c5e6b2c6d3c5"

RPROVIDES:${PN} += "libguestfs-xfs"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
