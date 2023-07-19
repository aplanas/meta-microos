SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-MicroOS-17.89-1.46.aarch64.rpm"
RPM_HASH = "90e8fb0786b5d11e32d9ea1fdb2d0d8798e59f03e3c857cdda26c92093e72d38fa2a3c1aea7313307c4bf698f268c28a20ab4ffc13eccbace0d98190aaa6d7c7"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
