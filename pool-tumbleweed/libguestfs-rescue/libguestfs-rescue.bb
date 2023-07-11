SUMMARY = "Virt-rescue shell"
DESCRIPTION = "This adds the virt-rescue shell which is a 'rescue disk' for virtual \
machines, and additional tools to use inside the shell such as ssh, \
network utilities, editors and debugging utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rescue-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "c557e529139cc257608fca7f574d7a956eccc5f1bd98be4896e05e356fff53a7413c79f1bb5b4f13f9db66beccaa6631d5f9f25a0b222c9448ec051e433d16ae"

RPROVIDES:${PN} += "libguestfs-rescue"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libguestfs.so.0 \
libxml2.so.2"

inherit rpm
