SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-net-openSUSE-17.90-1.28.aarch64.rpm"
RPM_HASH = "5c3cad40c539ee2fc2489af7e9ed58eea19e19eb7af23c66c1c14e1651ad49c4be7bd7b7e019fa8cf2e211044a67e537f27904d04b97c240ae9c46414effb402"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
