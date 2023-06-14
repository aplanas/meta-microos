SUMMARY = "'dm-zoned' device-mapper target manager"
DESCRIPTION = "The dmzadm utility formats backend devices used with the dm-zoned device \
mapper. This utility will inspect the device verifying that the device is a \
zoned block device and will prepare and write on-disk dm-zoned metadata \
according to the device capacity, zone size, etc."
LICENSE = "GPL-3.0-only"

PV = "2.2.0"

RPM_NAME = "dm-zoned-tools-2.2.0-1.8.aarch64.rpm"
RPM_HASH = "b5240b6c362dcf33c8a2e865c339bd2c353bb0206132234dc0f9e2ce6a55aa5b24b7682b8deb00a514f4e673a299dc1bf535dea1cbd376d215f9359ee05c1e97"

RPROVIDES:${PN} += "dm-zoned-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libkmod.so.2 \
libudev.so.1 \
libuuid.so.1"

inherit rpm
