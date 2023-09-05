SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-MicroOS-17.91-1.83.aarch64.rpm"
RPM_HASH = "1dcdb6021f7516e14974a3f1dbe3dcf8f28b1b2b7489731de7d906431f15678eabece50f17889685c648a2830f5870c16d2e84d5e83246aeba7f13aa3bd2fa32"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
