SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-systemd-sleep-plugin-2.06-53.3.noarch.rpm"
RPM_HASH = "3bc8732b768b455e900fb2d78cc1e93da6dcfd81db5f3bb1e20cc3f28d1ed79724426eda3b8854e1f81469054990ed05d52c1c84357b5078c7c394db57bbc7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
grub2 \
util-linux"

inherit rpm
