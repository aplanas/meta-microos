SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.89-1.47.noarch.rpm"
RPM_HASH = "1f5e9b775cf495c744965945bbaa91aa5f55296dfa0dbf41492ec183bc98c43fcf772a87ab7fe6420dec0ba4bee7cd61c5ed532256ccb02ec6af2ef4434ce285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
