SUMMARY = "Files to trigger ignition firstboot with grub2"
DESCRIPTION = "GRUB2 configuration which sets ignition.firstboot based on \
/boot/writable/firstboot_happened and ignition.firstboot and a matching service \
which creates firstboot_happened after the first boot."
LICENSE = "Apache-2.0"

PV = "2.15.0"

RPM_NAME = "ignition-dracut-grub2-2.15.0-2.5.aarch64.rpm"
RPM_HASH = "464a5479edf553c5d6418fb1c32eba5c74c582785896c4432f6dd70c35a4e64b15fbf0eddf1bb2576b8c2507b7fc2d7b3ae7cfba0e9261c102be29387dad7d62"

RPROVIDES:${PN} += "ignition-dracut-grub2"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
sed"

inherit rpm
