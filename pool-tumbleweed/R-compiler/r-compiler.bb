SUMMARY = "Package providing R-core packages R-compiler"
DESCRIPTION = "This package provides R-compiler, one of the R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-compiler-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "cd7956356b61ef697cf4f40c25d7ab5ac4313270e6c5119a08fc7beb37fc6a73e21be19cdc7bc79910081a2b6982eee49ebd4004dcd7634d5cd0ce638e3c4cd7"

RPROVIDES:${PN} += "R-compiler"

RDEPENDS:${PN} += "R-base"

inherit rpm
