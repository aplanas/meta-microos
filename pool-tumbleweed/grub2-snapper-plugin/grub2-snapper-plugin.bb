SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-snapper-plugin-2.12~rc1-1.1.noarch.rpm"
RPM_HASH = "a99f60835386e6805a84e5cfcbfa150a9d15794f1adfc5b055f96f95160d30d06dd4fd04f8fc905c90747883bfe752fadb05005da34e2aee534b7a3c9796d177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grub2-snapper-plugin \
grub2-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
libxml2-tools"

inherit rpm
