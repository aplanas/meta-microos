SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-openSUSE-17.89-1.31.aarch64.rpm"
RPM_HASH = "f5f8a1750eed5fb86aba5b28bddb85562ad094b824539702753f36208bdef4331245bbdac184a42cc910afd93543ccee7f1d390b8e2471cc16b1f41eef90a41e"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
