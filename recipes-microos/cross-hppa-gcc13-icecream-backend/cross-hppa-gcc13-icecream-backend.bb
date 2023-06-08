SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-hppa-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "859895509bfa4ce1c8e76a8dbfaba0696f77f79537f49d3893aff04e88157101cc49bf7ce94ad5398ccf262fb44e2ba8daf357f6c34035be7ac3d590de011cad"

RPROVIDES:${PN} += "cross-hppa-gcc13-icecream-backend cross-hppa-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
