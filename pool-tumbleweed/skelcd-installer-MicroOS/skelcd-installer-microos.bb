SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-MicroOS-17.89-1.40.aarch64.rpm"
RPM_HASH = "403600c633734d1cf3d845934b3a1db9406f4c127994370b2de3578fc853054de22b68edb971288d039cc691cfd32847a9ba65f23f8c9606dad58daa69a9b5fb"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
