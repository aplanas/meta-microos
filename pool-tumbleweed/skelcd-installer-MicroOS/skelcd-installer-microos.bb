SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-MicroOS-17.89-1.56.aarch64.rpm"
RPM_HASH = "f62bca3ebc4e5f9ebb5a236f5ed01cd2c94e7847653afa4202149ea22da5e35f85e33896d08948e1b0c55eaf8d0f30712b28785625e5f2dd976cb9e8d0ec0230"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
