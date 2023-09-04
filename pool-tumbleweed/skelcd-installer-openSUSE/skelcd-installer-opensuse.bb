SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-openSUSE-17.91-1.67.aarch64.rpm"
RPM_HASH = "d0411cd08b91be4a8af56ed01f271e88b2baaa70d6d6d874116069f1d75c034608d36586e0ffb7d0e24a73fa062d385b4e51d0124b2e7ff3cf8f1dc0671b0b49"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
