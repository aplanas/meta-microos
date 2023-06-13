SUMMARY = "Build Legacy-Free OS Images"
DESCRIPTION = "A fancy wrapper around dnf --installroot, debootstrap, pacstrap and zypper that \
may generate disk images with a number of bells and whistles. \
 \
Generated images are 'legacy-free'. This means only GPT disk labels \
(and no MBR disk labels) are supported, and only systemd based images \
may be generated. Moreover, for bootable images only EFI systems are \
supported (not plain MBR/BIOS)."
LICENSE = "LGPL-2.1-or-later"

PV = "14"

RPM_NAME = "mkosi-14-1.2.noarch.rpm"
RPM_HASH = "ce3bc9563e371d71c595843dcb5b569381813e61ab594ed20630d253f012ae1c179226a88d770247454e4a8d768f78e618eab251f504c53ce3dd45742737bcda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mkosi \
python3.10dist(mkosi) \
python3dist(mkosi)"

RDEPENDS:${PN} += "/usr/bin/bash \
python(abi) \
python3 \
squashfs \
tar \
xz"

inherit rpm
