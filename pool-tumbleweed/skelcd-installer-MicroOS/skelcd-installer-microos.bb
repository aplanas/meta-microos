SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-MicroOS-17.90-1.30.aarch64.rpm"
RPM_HASH = "e3a4cc639e63cb26f58584d1d6656f1d5bbb00c42a1f8699026a8453ea731ea8311848540fe15d12d6c702c416b8cec8378d0d909eefad3f4c3716176a3e9efc"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
