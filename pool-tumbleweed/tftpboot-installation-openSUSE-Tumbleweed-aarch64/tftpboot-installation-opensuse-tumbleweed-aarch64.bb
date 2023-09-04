SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.91-1.67.noarch.rpm"
RPM_HASH = "f24613a43921ee109e94e3caee5b4db8cd200887d50882588ffa8a99203cedf32663787f6c068cd3beece209793436b846a6fc7f7b633c5ad41e0929deba0044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
