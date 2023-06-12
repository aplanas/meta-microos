SUMMARY = "Scripts aimed at automating some menial installation/recovery tasks"
DESCRIPTION = "This package provides helper scripts originating in Arch Linux that are useful during manual installation and recovery of any Linux distro. \
 \
* genfstab: Automatically generate an fstab file \
* arch-chroot: Set up bind mounts and chroot into the target system"
LICENSE = "GPL-2.0-only"

PV = "28"

RPM_NAME = "arch-install-scripts-28-1.2.noarch.rpm"
RPM_HASH = "ccaee5f17ec78abd93246817ccf9a11a43068cf44deb42daac1c6bc82aabcdd9cee499f2e6a425c76e94975154308778f086292daccd0b4ee8a9e694239f7294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arch-install-scripts"
RDEPENDS:${PN} += "/bin/bash \
awk \
bash \
coreutils \
util-linux \
util-linux-systemd"

inherit rpm
