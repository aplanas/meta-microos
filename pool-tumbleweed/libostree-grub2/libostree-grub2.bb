SUMMARY = "GRUB2 integration for OSTree"
DESCRIPTION = "GRUB2 integration for OSTree"
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-grub2-2023.2-2.1.aarch64.rpm"
RPM_HASH = "3e5caadc6e383fd4f23e968c9f216b3ef623d7db4a8f559e91e0608fea439eef272ae8309bbfe297ba92eabe5116e9fcf57d40478fb6388b8156f2e30ae109ea"

RPROVIDES:${PN} += "libostree-grub2 \
ostree-grub2"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2-efi"

inherit rpm
