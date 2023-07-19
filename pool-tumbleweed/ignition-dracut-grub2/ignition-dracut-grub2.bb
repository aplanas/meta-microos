SUMMARY = "Files to trigger ignition firstboot with grub2"
DESCRIPTION = "GRUB2 configuration which sets ignition.firstboot based on \
/boot/writable/firstboot_happened and ignition.firstboot and a matching service \
which creates firstboot_happened after the first boot."
LICENSE = "Apache-2.0"

PV = "2.16.2"

RPM_NAME = "ignition-dracut-grub2-2.16.2-1.1.aarch64.rpm"
RPM_HASH = "06c0bae92d581202ad11d8ef3f870e2e0cbab6b66f7a9c9a154ddb681b5d43e7158d58d8ad2a48749976bb68e89c4d5508af3bec802a3330fe648b12ad6e6732"

RPROVIDES:${PN} += "ignition-dracut-grub2"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
sed"

inherit rpm
