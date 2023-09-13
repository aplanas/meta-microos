SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.91-1.100.noarch.rpm"
RPM_HASH = "adc991542fff4a6eefb27ab25ceafe328fc49dde9deeace8016bf7dbd20bc467dd5ba63bd8da90a8e107fe05366d88a2b42fd827a8e518c7ba0ef0b28a5b0a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
