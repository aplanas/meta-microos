SUMMARY = "Development files for libguestfs"
DESCRIPTION = "Development files for libguestfs. \
 \
libguestfs is a set of tools for accessing and modifying virtual machine (VM) \
disk images. You can use this for viewing and editing files inside guests, \
scripting changes to VMs, monitoring disk used/free statistics, P2V, V2V, \
performing partial backups, cloning VMs, and much else besides."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-devel-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "aa8297d52b40d3e4dc9c149d086c678ac25674d7b266be3624b0861371bfa1c61a579bc8a56b2ae6e19d0328e6c2ac8178144f8590ade89072a4cc8d7ef44e12"

RPROVIDES:${PN} += "libguestfs-devel \
pkgconfig-libguestfs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libguestfs0"

inherit rpm
