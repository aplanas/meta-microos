SUMMARY = "Haskell binary library development files"
DESCRIPTION = "This package provides the Haskell binary library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-devel-0.8.9.1-3.1.aarch64.rpm"
RPM_HASH = "add5f37cfe93e84f1f67dba261fc016c6446b5bded74e69fa49672f6860009a4fb53ef175b98eafc0136e5c829e32e6c281a05d2e167e90e748fb1cc41a3494d"

RPROVIDES:${PN} += "ghc-binary-devel ghc-binary-devel(aarch-64) ghc-binary-static ghc-binary-static(aarch-64) ghc-devel(binary-0.8.9.1)"
RDEPENDS:${PN} += "ghc-binary(aarch-64) ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7)"

inherit rpm
