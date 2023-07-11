SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.89-1.31.noarch.rpm"
RPM_HASH = "41059a0a295e750bf2b4b25a51cf2db01d7ed1c388c999b0cedbac70ca40adf95f3a54e3cda260782896580c5af0dc9a0b484432a193b5563f28ee0e918f8043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
