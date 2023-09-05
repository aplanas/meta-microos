SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.91-1.83.noarch.rpm"
RPM_HASH = "077730d10e6eda3b83e611908be03c69d82490b7daa11caa589a566ffb5bb822d3ff243ab0efab9d9939a5c996cb23f74f4d4645f55cb28af845679ffa7f01bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
