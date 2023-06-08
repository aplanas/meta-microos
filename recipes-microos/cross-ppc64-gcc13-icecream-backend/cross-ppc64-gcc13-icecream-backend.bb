SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-ppc64-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "432edbd0301dadcb33b85f633e48689c616caacf255e59157ebac2f65f614759f3f6e320db98640dc9f1cd005869d1d61d90666363d54891db7e0d124117cefc"

RPROVIDES:${PN} += "cross-ppc64-gcc13-icecream-backend cross-ppc64-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
