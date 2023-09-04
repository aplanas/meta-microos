SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.91-1.66.noarch.rpm"
RPM_HASH = "f1bd3c047b2cc5c434a515af0df8291478147e305280cf9791a631472fc474079f05e5ff4f93fff3daa4a842bf617818787b0949fcae5e25989ed92de8de9b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
