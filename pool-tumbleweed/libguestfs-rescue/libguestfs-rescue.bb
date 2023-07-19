SUMMARY = "Virt-rescue shell"
DESCRIPTION = "This adds the virt-rescue shell which is a 'rescue disk' for virtual \
machines, and additional tools to use inside the shell such as ssh, \
network utilities, editors and debugging utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rescue-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "b4f0efc12e25cd5cd151e54b13b02da4f03bee4f33bbecd3e82f6415634b6d5caff66bb2998c3d3fcb93b1f81f4e9d7030393ef76bef04c17c4150a8c0a396bf"

RPROVIDES:${PN} += "libguestfs-rescue"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libguestfs.so.0 \
libxml2.so.2"

inherit rpm
