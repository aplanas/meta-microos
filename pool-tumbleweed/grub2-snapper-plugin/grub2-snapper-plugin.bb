SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-snapper-plugin-2.06-54.1.noarch.rpm"
RPM_HASH = "b8567c656748ca6e4ef421d62197b8194992b530f8ffcf44cacac572a08aee0f557be6c9bcecc430cdd1930e047bb27ae9006423b92b7e474407903f98a4a0e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grub2-snapper-plugin \
grub2-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2 \
libxml2-tools"

inherit rpm
