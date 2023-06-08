SUMMARY = "Haskell ghc-compact library development files"
DESCRIPTION = "This package provides the Haskell ghc-compact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-devel-0.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "3164c0ca031c3057b5f1f5e097066d14ed1776f160507213d6e52f95b8e99b4d38a63cea04a1ab5c1453b1a7d3eca9580457549649898acb6c21cc3aed25923f"

RPROVIDES:${PN} += "ghc-devel(ghc-compact-0.1.0.0) ghc-ghc-compact-devel ghc-ghc-compact-devel(aarch-64) ghc-ghc-compact-static ghc-ghc-compact-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(ghc-prim-0.9.0) ghc-ghc-compact(aarch-64)"

inherit rpm
