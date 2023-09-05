SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.91-1.84.noarch.rpm"
RPM_HASH = "f43d9c50d01f8e0675968912a2d0f7424506f11ac51c7dcd6a07fbb9389c171d36bea4aa6e45d606c79758aed0d7a8907cccf7ee5003d66d97544fac09872c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
