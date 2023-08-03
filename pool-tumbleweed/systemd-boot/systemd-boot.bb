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

PV = "253.7"

RPM_NAME = "systemd-boot-253.7-2.1.aarch64.rpm"
RPM_HASH = "4fe0c93c2f9c811d8a728ee69ac00f4f1f76a93bde60abf0f96da9dfb4530ff8955228d47de8376019cd41c464b3338d0cf794354772fbe8f94dac9f1730de6d"

RPROVIDES:${PN} += "systemd-boot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-253.so"

inherit rpm
