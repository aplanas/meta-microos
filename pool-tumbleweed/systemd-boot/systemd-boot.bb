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

PV = "253.8"

RPM_NAME = "systemd-boot-253.8-1.2.aarch64.rpm"
RPM_HASH = "23fba9d538d237d0bf32531d458e2cf5d7df340b8c693bc7ef20c3e545c104e2f56a1b14e7814f6d9d46fd0aca82556b426af821a34c3ba7c275709d3304f5c2"

RPROVIDES:${PN} += "systemd-boot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-253.so"

inherit rpm
