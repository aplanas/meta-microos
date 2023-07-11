SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-snapper-plugin-2.06-53.3.noarch.rpm"
RPM_HASH = "6d2a8c3d19782c7b4e2d9d47a4affdc7be0a431f287f90869c93dd2d8593627182a71823b638cf1d407eaa741fdfe686b2a3027e0d169111fa31ad12e644ac4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grub2-snapper-plugin \
grub2-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
libxml2-tools"

inherit rpm
