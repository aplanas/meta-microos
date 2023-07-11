SUMMARY = "Development files for libguestfs"
DESCRIPTION = "Development files for libguestfs. \
 \
libguestfs is a set of tools for accessing and modifying virtual machine (VM) \
disk images. You can use this for viewing and editing files inside guests, \
scripting changes to VMs, monitoring disk used/free statistics, P2V, V2V, \
performing partial backups, cloning VMs, and much else besides."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-devel-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "eb6670fe54a751ebe3c93f6e8d549fe52c0f4fd6b1bf97609b0d4e257387e2f4f349ef1e0071646e60c336f457fd6803ad160045e22f9e8e620055f6bda6230f"

RPROVIDES:${PN} += "libguestfs-devel \
pkgconfig-libguestfs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libguestfs0"

inherit rpm
