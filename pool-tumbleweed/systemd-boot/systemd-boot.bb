SUMMARY = "A simple UEFI boot manager"
DESCRIPTION = "This package provides systemd-boot (short: sd-boot), which is a simple UEFI boot \
manager. It provides a textual menu to select the entry to boot and an editor \
for the kernel command line. systemd-boot supports systems with UEFI firmware \
only. \
 \
This package also contains bootctl(1) and services to manage boot loaders that \
implement the Boot Loader Specification[1] and the Boot Loader Interface[2] on \
EFI systems, such as systemd-boot. \
 \
Note that systemd-boot is not fully integrated in openSUSE distributions yet \
hence its installation requires special care and manual steps when used on \
systems supporting secure boot or snapshots. For more details, visit: \
https://en.opensuse.org/Systemd-boot \
 \
[1] https://uapi-group.org/specifications/specs/boot_loader_specification/ \
[2] https://systemd.io/BOOT_LOADER_INTERFACE/"
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "systemd-boot-253.5-5.1.aarch64.rpm"
RPM_HASH = "da670f255c479cacf8c47cd8de1a2293187db4c8844a44e3a15af534772d222698d253743caab90a8a9b9af390195c5f684ffd37bf2c482fd18cf4a5439159c8"

RPROVIDES:${PN} += "systemd-boot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-253.so"

inherit rpm
