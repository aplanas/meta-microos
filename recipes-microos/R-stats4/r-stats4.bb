SUMMARY = "Package providing R-stats4"
DESCRIPTION = "This package provides R-stats4, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-stats4-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "5f64537c02833e0aba413148a3e4643a41595d63f6c1eee5957c7f84caf5a78f402aa9155ca5186a8ff3152a02663d33bfe8214f5a9fbc3462cfee52adbcf2ca"

RPROVIDES:${PN} += "R-stats4 R-stats4(aarch-64)"
RDEPENDS:${PN} += "R-base"

inherit rpm
