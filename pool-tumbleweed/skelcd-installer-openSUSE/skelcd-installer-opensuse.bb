SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-openSUSE-17.91-1.84.aarch64.rpm"
RPM_HASH = "2f0b241499d66b269209011efed54809cd9511b4e979fe7011c3c811128fe2f34d96c6466607220ec79319a0bea1092bf46085b99bd2ad7beb77d7bc7b944e46"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
