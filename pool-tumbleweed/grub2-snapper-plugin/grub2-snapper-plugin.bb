SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-snapper-plugin-2.12~rc1-2.1.noarch.rpm"
RPM_HASH = "cd3b4fa2ecf48f75be48c17270df36b2da0873306434858a502a0aad9d717ba0a0efcc2a5dac3d6e45ffa3831481a9a829fe78fe88ece6dd765c87dc2a6c36be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grub2-snapper-plugin \
grub2-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
libxml2-tools"

inherit rpm
