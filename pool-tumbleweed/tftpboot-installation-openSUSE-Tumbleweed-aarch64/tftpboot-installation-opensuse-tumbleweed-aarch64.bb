SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.91-1.90.noarch.rpm"
RPM_HASH = "801fb59751e4b2ae4cb457e96d4550b89d32cda29f21242dd7d4aec025182acb1287c1ac3494b1bdb7b3f21c86075e96ac26b6778b6a086dd0fe9ddf5dd0df56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
