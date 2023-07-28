SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.89-1.56.noarch.rpm"
RPM_HASH = "45eb03334aabca34c8e7f5b74161d517971be1fc80d073d957f19064a9ca87aad5b4b5208c96c83f6e4cfd16c50bfcf153f2fe3ad61cd7a4ee98984a093e0e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
