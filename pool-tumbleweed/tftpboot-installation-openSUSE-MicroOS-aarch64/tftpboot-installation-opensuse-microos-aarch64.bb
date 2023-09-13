SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.91-1.98.noarch.rpm"
RPM_HASH = "00382709020bc5f7d014b64de74eca3ce1fefe0649d409977872163ae6b0f210e55d9807e8e5c3b3dfc16e1031a9e2e5b5be3bc2427700e6ebb3e163ad437ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
