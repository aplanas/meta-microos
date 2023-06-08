SUMMARY = "Haskell binary library development files"
DESCRIPTION = "This package provides the Haskell binary library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-devel-0.8.9.1-1.1.aarch64.rpm"
RPM_HASH = "83a81228c001205ce41c59390283d21f118d3d9ec3b1d4aa9a33dd621bf32eaa0496a96ce8988ad0368065a52ba93d069acfb109bafba96515e3554062bb3561"

RPROVIDES:${PN} += "ghc-binary-devel ghc-binary-devel(aarch-64) ghc-binary-static ghc-binary-static(aarch-64) ghc-devel(binary-0.8.9.1)"
RDEPENDS:${PN} += "ghc-binary(aarch-64) ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7)"

inherit rpm
