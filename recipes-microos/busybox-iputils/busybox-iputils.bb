SUMMARY = "Busybox applets replacing iputils"
DESCRIPTION = "This package contains the symlinks to replace iputils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-iputils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "5ea2137fcf0699a87c4de0d90f616a7215aa70eb803abb8a2333e351e17a85a3105a274a6f3c99d5533acab54423a3aae632deb3ebeb84ce372a4433f30e4faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/ping busybox-iputils"
RDEPENDS:${PN} += "busybox"

inherit rpm
