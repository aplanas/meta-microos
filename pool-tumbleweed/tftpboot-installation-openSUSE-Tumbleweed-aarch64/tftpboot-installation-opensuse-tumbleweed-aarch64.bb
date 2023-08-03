SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.90-1.24.noarch.rpm"
RPM_HASH = "a1054593c1a2e43fa0e37ceab54d4c204b8172fffa43490f8917c0883d2cdf0a95dcc103a4705368aa59fa2470321acb9850e5cc8f13d6f7aeee14eb03fa5e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
