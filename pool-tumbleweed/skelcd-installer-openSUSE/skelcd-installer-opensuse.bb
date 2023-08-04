SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-openSUSE-17.90-1.28.aarch64.rpm"
RPM_HASH = "460e998f3f38f5cd4d4c9ec93c772cc82d54d152428fbc161b6fb226ae50a49084c5ab397a5058ae56cca99616c39aba75caa8b816d3a64d1b1961000879b2bd"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
