SUMMARY = "GRUB2 integration for OSTree"
DESCRIPTION = "GRUB2 integration for OSTree"
LICENSE = "LGPL-2.0-or-later"

PV = "2023.6"

RPM_NAME = "libostree-grub2-2023.6-1.1.noarch.rpm"
RPM_HASH = "5136670330e2db8624f8ee4de57a25aa9da3a6396a05b6a5b7f75258fe65077e71c8c63c28576c3e6678fe383b33bec895f6e9137d7bb98bc4a1ef0c3d270907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libostree-grub2 \
libostree-grub2 \
ostree-grub2"

RDEPENDS:${PN} += "/usr/bin/sh \
grub2-efi"

inherit rpm
