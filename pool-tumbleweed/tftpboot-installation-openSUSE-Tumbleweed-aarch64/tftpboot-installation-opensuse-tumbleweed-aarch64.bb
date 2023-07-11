SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.89-1.31.noarch.rpm"
RPM_HASH = "47da4225bb79c4e369ac0d8a64831cb815578c77c91210462d15f45a86cb06325bd7f5eccaa8f57f579a721b1e55cfa6bfceacaa11433b63964343e6e87fb116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
