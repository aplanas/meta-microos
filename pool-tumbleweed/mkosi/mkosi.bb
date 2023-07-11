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

RPM_NAME = "mkosi-14-1.3.noarch.rpm"
RPM_HASH = "5bb7e84011dd6b248e2562f6f6e06ea7fcf8455a1ba24836d2f1a9e38c285453976bf6ea8f17eb0d651330ff32a2b5fd6f1cd0c074c1ae901c9c5dd85ce8d831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mkosi \
python3.11dist-mkosi \
python3dist-mkosi"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python3 \
squashfs \
tar \
xz"

inherit rpm
