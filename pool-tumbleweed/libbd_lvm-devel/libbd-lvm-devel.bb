SUMMARY = "Development files for the libblockdev-lvm plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_lvm plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "6f1c59329894c7b10f179f7eea72f1160d0d50a9ef03e596c8aec3620113020e888b2edec017e1984ee620a975df73986e4f21193286ec06e1e0941090444fc7"

RPROVIDES:${PN} += "libbd-lvm-devel \
libblockdev-lvm-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-lvm2 \
libbd-utils-devel"

inherit rpm
