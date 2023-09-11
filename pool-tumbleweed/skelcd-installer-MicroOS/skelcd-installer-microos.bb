SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-MicroOS-17.91-1.88.aarch64.rpm"
RPM_HASH = "14ec7f2dbd05f30002b5e980aca608a53b8383ed54fab4e947d031cfc779ffc45edecaf14a9d2b99e7d57dd75b3003a730b9d5d1da05032ca26f32083f1963bd"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
