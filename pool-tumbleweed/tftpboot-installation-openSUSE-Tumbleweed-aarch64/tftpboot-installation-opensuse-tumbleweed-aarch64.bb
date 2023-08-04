SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.90-1.28.noarch.rpm"
RPM_HASH = "cbdb227ceca163afa3a62d85384afa2f3aa8e16bc867f06dedb5d3dc5053c01e355ff58ab69b58037f9e012a5cd1914c069fe76e732fb5af274733276a0aa553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
