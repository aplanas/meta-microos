SUMMARY = "Development files for libguestfs"
DESCRIPTION = "Development files for libguestfs. \
 \
libguestfs is a set of tools for accessing and modifying virtual machine (VM) \
disk images. You can use this for viewing and editing files inside guests, \
scripting changes to VMs, monitoring disk used/free statistics, P2V, V2V, \
performing partial backups, cloning VMs, and much else besides."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-devel-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "01ffea9aaebcb73e4fde2d4db5d16f289ed986505abe064a5d323610a9983c30a8427c8f17e8ac7e12e9dbbe066a3eb58142b53eb9b2212d3c19ba5ff54396e7"

RPROVIDES:${PN} += "libguestfs-devel \
pkgconfig-libguestfs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libguestfs0"

inherit rpm
