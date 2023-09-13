SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-MicroOS-17.91-1.98.aarch64.rpm"
RPM_HASH = "83007c95a4a064c09a1476a33fef13c882e37b09853f2a7b733f6e29cb54572ea0956ab6912d314d51c17a1b4af053f4725a7d112b3757d52681b8932cb65569"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
