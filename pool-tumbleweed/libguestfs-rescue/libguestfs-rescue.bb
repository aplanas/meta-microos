SUMMARY = "Virt-rescue shell"
DESCRIPTION = "This adds the virt-rescue shell which is a 'rescue disk' for virtual \
machines, and additional tools to use inside the shell such as ssh, \
network utilities, editors and debugging utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rescue-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "533421b62729e879d0740862f3f5174e2652bef1f3f7bf4dd6e037dcde13e481617e3e8bdd055288a52e25d47864cef8d9e78da9298757149a4f1511dad1fc2e"

RPROVIDES:${PN} += "libguestfs-rescue"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libguestfs.so.0 \
libxml2.so.2"

inherit rpm
