SUMMARY = "Shared data for eiskaltdcpp"
DESCRIPTION = "This package contains shared data for EiskaltDC++."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-common-2.4.2-1.13.noarch.rpm"
RPM_HASH = "1150a018663b8b4665d7e33784a741e93c6c0b97d014ecbac04db4c563acc4d134f5ba138bdd90f4946662ffbe055caa719ae4b952acab764ef7495704e2e420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-common"

RDEPENDS:${PN} += "libeiskaltdcpp2-4"

inherit rpm
