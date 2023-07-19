SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-MicroOS-17.89-1.46.aarch64.rpm"
RPM_HASH = "79ed33a04089538adf70649ec18a41e5f6fce5a5eea61159f557830d15fd711341d81fb3f7adeb975c5204205b0b83892b06cbb2d265a654857276f9fdf2d33f"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
