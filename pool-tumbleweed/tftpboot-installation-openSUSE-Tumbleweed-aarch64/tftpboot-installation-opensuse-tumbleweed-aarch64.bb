SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.89-1.40.noarch.rpm"
RPM_HASH = "795bf08a29492da96188883428578075fd8a68382831ba80aff67f74f61154eab31fffe298a2b2ca8d8519c8d7f42fe5c8ad6d08fa26208c13597f418157e58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
