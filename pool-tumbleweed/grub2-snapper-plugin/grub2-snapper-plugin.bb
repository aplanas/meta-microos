SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-snapper-plugin-2.06-55.1.noarch.rpm"
RPM_HASH = "29a9518a213e2aba8e29b7af514b26f0863588524d5ae8e0d55bdce33292626e17a7a5cf26deadf1afe5ab406d77fdf5ea48a94b611fb1fb34c105a960314ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grub2-snapper-plugin \
grub2-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
libxml2-tools"

inherit rpm
