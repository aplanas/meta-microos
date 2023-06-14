SUMMARY = "Development files for the libblockdev-lvm plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_lvm plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "ef40ce2d9b2847eacb73367edce47e8b05f373a3330961ba89fe756374c7e4b25f6c1b3efd38d423accb7b117bbba16466ae1f12d27df5aa6ba302cbe47c5c8d"

RPROVIDES:${PN} += "libbd-lvm-devel \
libblockdev-lvm-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-lvm2 \
libbd-utils-devel"

inherit rpm
