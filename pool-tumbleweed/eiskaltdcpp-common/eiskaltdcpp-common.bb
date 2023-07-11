SUMMARY = "Shared data for eiskaltdcpp"
DESCRIPTION = "This package contains shared data for EiskaltDC++."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-common-2.4.2-1.14.noarch.rpm"
RPM_HASH = "71de77c711554f9e84f64745dd79b8941b085c685ba6030624c818ba5c14c5b939f52fd78ad200789a82da4eb01106bdd04d2ff27280a7c8a7510b095ac68ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-common"

RDEPENDS:${PN} += "libeiskaltdcpp2-4"

inherit rpm
