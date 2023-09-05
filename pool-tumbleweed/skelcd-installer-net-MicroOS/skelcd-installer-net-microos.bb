SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-MicroOS-17.91-1.83.aarch64.rpm"
RPM_HASH = "f754eda1e8241742cbd9ef852082b92fdac621ab057948e3f1064ed0ed070e1ecbb4604eac08f44be9abee80807647ff3154b9ef4dc49ee411b1a0166a95f619"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
