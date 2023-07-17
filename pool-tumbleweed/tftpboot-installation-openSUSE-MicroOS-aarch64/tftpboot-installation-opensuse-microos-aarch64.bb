SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.89-1.40.noarch.rpm"
RPM_HASH = "2af8428fd8bebbd36d9ab0b3186f2a06b08c16f5f0a2d9a334804e41224a7e9835b4bf0862872460266344079390831581a3dbcb7c889127be119e128da56bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
