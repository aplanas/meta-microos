SUMMARY = "Package providing R-splines"
DESCRIPTION = "This package provides R-splines, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-splines-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "5170e321e9eb15378f1d211939a48b287f851fd876b2e458b945411fde3a4e61201bd59ab05c87a404ba467e33cb9b766af960355965c31e67be5a17a94483b7"

RPROVIDES:${PN} += "R-splines \
R-splines(aarch-64)"

RDEPENDS:${PN} += "R-base \
libR.so()(64bit) \
libc.so.6()(64bit)"

inherit rpm
