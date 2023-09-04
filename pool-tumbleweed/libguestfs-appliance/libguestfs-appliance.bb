SUMMARY = "Virtual machine needed for libguestfs"
DESCRIPTION = "libguestfs-appliance provides the appliance used by libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-appliance-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "64ed9cf8069fa528f0d6707776b134c4511a590760b5e5a8339c00a152426044160bb1c86887fc4a24dd6908700fa13907710e44df2cab3a36c3ba351b841e5f"

RPROVIDES:${PN} += "guestfs-data \
libguestfs-appliance"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
libaugeas0 \
libcap2 \
libguestfs0 \
libhivex0 \
libpcre1 \
qemu-tools \
supermin"

inherit rpm
