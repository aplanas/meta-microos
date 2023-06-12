SUMMARY = "Haskell array library development files"
DESCRIPTION = "This package provides the Haskell array library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-devel-0.5.4.0-3.1.aarch64.rpm"
RPM_HASH = "a2e5fd1d063e2be5d703d05af60134ad0ce24d12de70c9d4cd99607cb6979952c87204382b74a5aaea1e138892025dd038c90c4680e0e55e269d866c83419d24"

RPROVIDES:${PN} += "ghc-array-devel ghc-array-devel(aarch-64) ghc-array-static ghc-array-static(aarch-64) ghc-devel(array-0.5.4.0)"
RDEPENDS:${PN} += "ghc-array(aarch-64) ghc-compiler ghc-devel(base-4.17.1.0)"

inherit rpm
