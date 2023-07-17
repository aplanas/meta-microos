SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-MicroOS-17.89-1.40.aarch64.rpm"
RPM_HASH = "cef42788a7827865b47ad2beb5f860de52596e57390ecabf1ffa633ad03b800a524b7b05d68262f1c4e2db0e86692d9e2e767fc54f5ae4c66ea38ae2e4fa1d67"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
