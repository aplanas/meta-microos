SUMMARY = "GRUB2 integration for OSTree"
DESCRIPTION = "GRUB2 integration for OSTree"
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-grub2-2023.2-2.2.aarch64.rpm"
RPM_HASH = "bc7bb8c4aaf494819951e3a2e8bd3fca0566e77d0ac0976a923397b706fdfb4d113116b9dfa241cc967e1955ea6ce1eaf8577ef1c230b24822155f6972d6e48a"

RPROVIDES:${PN} += "libostree-grub2 \
ostree-grub2"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2-efi"

inherit rpm
