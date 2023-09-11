SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.91-1.88.noarch.rpm"
RPM_HASH = "370d7bbafa9395e6958bd2bbb3d2a0727e19ba4fd08675cefffa51d10a956e21a0d47e931c54fe91ba63e91dd6a17a732c10841bfba3755e1a9229d8df70b6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
