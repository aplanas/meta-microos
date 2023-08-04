SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.90-1.30.noarch.rpm"
RPM_HASH = "567fe6427b773aa5a2d3be0bb6cb5a5b12988017b609f3fe009c9bfbae3859a598140ce04f907b8da79046794993097879be2cc80dce37a0b546c8d191b8d5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
