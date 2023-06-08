SUMMARY = "Haskell exceptions library development files"
DESCRIPTION = "This package provides the Haskell exceptions library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-devel-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "6ef008458b849119182b651de2a38c1eef8c8837aadd21654bf097c01d864e16584c1d891503091b3c28787b86720faae739d74dedf1fb5cde01a4df1e8fb3e9"

RPROVIDES:${PN} += "ghc-devel(exceptions-0.10.5) ghc-exceptions-devel ghc-exceptions-devel(aarch-64) ghc-exceptions-static ghc-exceptions-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(mtl-2.2.2) ghc-devel(stm-2.5.1.0) ghc-devel(template-haskell-2.19.0.0) ghc-devel(transformers-0.5.6.2) ghc-exceptions(aarch-64)"

inherit rpm
