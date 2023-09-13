SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-systemd-sleep-plugin-2.12~rc1-2.1.noarch.rpm"
RPM_HASH = "9f3e03d98b7a69f3d05a7cc5259b98c698e93031cfa7042c264cc418999f251c5d98d91777fe15a619338a036434e0e6d89032113dd1d83150d20edd4127376c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
grub2 \
util-linux"

inherit rpm
