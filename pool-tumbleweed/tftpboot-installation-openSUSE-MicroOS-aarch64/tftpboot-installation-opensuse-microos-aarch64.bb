SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.90-1.26.noarch.rpm"
RPM_HASH = "65834a1da7a01ad0239e2bbc9470a13c8d64240b9592911190bd3cee0da958c5d9a790efaecaa8a8614ba0b28f633839fa7dfa3f67dde9d3e585b1b34f71c47f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
