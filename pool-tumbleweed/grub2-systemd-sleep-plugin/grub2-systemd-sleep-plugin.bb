SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-systemd-sleep-plugin-2.06-55.1.noarch.rpm"
RPM_HASH = "a845c021e557c1b04afb5605955d8cc6c5ccc52fe6bcf949614cda3a615fb48d1abc0e48b2a65dd9981d0c79876c171e47ac7379c057dadebd63587c17747510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
grub2 \
util-linux"

inherit rpm
