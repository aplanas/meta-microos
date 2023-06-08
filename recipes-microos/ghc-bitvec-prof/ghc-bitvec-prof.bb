SUMMARY = "Haskell bitvec profiling library"
DESCRIPTION = "This package provides the Haskell bitvec profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.4.0"

RPM_NAME = "ghc-bitvec-prof-1.1.4.0-1.3.aarch64.rpm"
RPM_HASH = "2011f0054354f247e54b84650c2368b49ed32106bf2ce262d7d3fc362e1903c7409a07a7351617d513f1ae892e62fbc10566ad3b13f77220abe84745e3d3a11c"

RPROVIDES:${PN} += "ghc-bitvec-prof ghc-bitvec-prof(aarch-64) ghc-prof(bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy)"
RDEPENDS:${PN} += "ghc-bitvec-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-bignum-1.3) ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
