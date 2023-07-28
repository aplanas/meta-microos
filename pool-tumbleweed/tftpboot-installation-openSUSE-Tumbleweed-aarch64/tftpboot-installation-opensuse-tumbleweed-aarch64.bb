SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.89-1.57.noarch.rpm"
RPM_HASH = "5b3d3fb0ba83a90f59df132a5a4973d99de771b3e35b05beba82d66cee023d54ee59b598e0504cfd226cd33a4f1a6bdafc80894f015ad55caca843a685d0ba07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
