SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-openSUSE-17.91-1.67.aarch64.rpm"
RPM_HASH = "a049851585841dd90195ee7d56516ca2c392f46502ba7dcb805042498f7efa67d2df0c441de6606d394a8f4270ce53c197d7c39e8d71b64031c6cd9cb19564be"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
