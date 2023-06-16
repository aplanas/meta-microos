SUMMARY = "Tool for creating Debian Linux containers"
DESCRIPTION = "A tool to facilitate the creation of Linux containers for developing Debian \
systems."
LICENSE = "GPL-2.0+"

PV = "0.9"

RPM_NAME = "holodev-0.9-1.15.noarch.rpm"
RPM_HASH = "4c3b736d02c1500eadeb4b1ae34c4028d3d5e0f1263d0e40e361cac3529adf40c5887b033577dac0bcd114ee3547f7a93084d282b02fa37f3570fd343e85ac10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-holodev \
holodev"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
bridge-utils \
debootstrap \
git \
libvirt \
lxc \
sudo"

inherit rpm
