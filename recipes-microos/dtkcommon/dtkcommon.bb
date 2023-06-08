SUMMARY = "The DTK Tools"
DESCRIPTION = "A public project for building DTK Library"
LICENSE = "GPL-3.0+"

PV = "5.5.23"

RPM_NAME = "dtkcommon-5.5.23-1.2.aarch64.rpm"
RPM_HASH = "e23ecde1a261b9615d1753ae21387e1387820394d9eb23e627b7714a70210bbd7f3671b84650b9436fcb8d2d19b220f88ab9d86469ce9c5cd64de1c45b1ef62e"

RPROVIDES:${PN} += "cmake(Dtk) cmake(DtkInstallDConfig) dtkcommon dtkcommon(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
