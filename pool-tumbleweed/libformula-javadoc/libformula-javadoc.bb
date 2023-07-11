SUMMARY = "Javadoc for libformula"
DESCRIPTION = "Javadoc for libformula."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libformula-javadoc-1.1.6-1.5.noarch.rpm"
RPM_HASH = "1426e4c5d14efe654d55762b592f93bbc19d2c45ff754f06faeba59f936d33fe4cd37bd17453170ad445fec3cc6d56437b276580f1b056d80005047e0b3c650e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libformula-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
