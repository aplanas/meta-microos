SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-systemd-sleep-plugin-2.06-54.1.noarch.rpm"
RPM_HASH = "497d9f0e0914075589ab0c20f1817596c9be5c3b1dc74e4e78c3a35dd582757adc533ee76d8a9784b1e2d6ae6cb7f61e5b8397435f57f62cbd729f291a17a08f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
grub2 \
util-linux"

inherit rpm
