SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-snapper-plugin-2.06-53.1.noarch.rpm"
RPM_HASH = "f5459b3217e15c8d6f7bec4b2e6bc8cee704bdc10a2ea705719a9bb676ff1fe26dd73fd909bf8c0116a245d21d7ac2968aaa2b7f8a22f7d0b242bfaf5d1ebf21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grub2-snapper-plugin \
grub2-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
libxml2-tools"

inherit rpm
