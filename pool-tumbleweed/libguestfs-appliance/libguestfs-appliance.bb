SUMMARY = "Virtual machine needed for libguestfs"
DESCRIPTION = "libguestfs-appliance provides the appliance used by libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-appliance-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "d0194ded183f00bebb62c0a750c55812abdb8ec99958d3094b245909ab9b23fb78859faa9121522b6da91cbaf7d5d6affb23bada7579c81bf618ee847bba5a3a"

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
