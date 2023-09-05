SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-systemd-sleep-plugin-2.12~rc1-1.1.noarch.rpm"
RPM_HASH = "f63a5182e8b0fc8ee0d4c436d93c6158c10b4bf499b15c81cb8915966b4524fbd73fa388a4e1d2ee0cde9021077fbee85fc70e7efa2ee21016c840f96f4540b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
grub2 \
util-linux"

inherit rpm
