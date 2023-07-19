SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.89-1.46.noarch.rpm"
RPM_HASH = "72b1f1695998c4088eeb1711b6431b0c99b1a6d36bcc77d4b30d9e3fab40776a5416cddc6dd4b3232c4fd50386fcb1527681e5a58ee4c592a9944c3bb713137e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
