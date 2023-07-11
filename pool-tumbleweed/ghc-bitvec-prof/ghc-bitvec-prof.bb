SUMMARY = "Haskell bitvec profiling library"
DESCRIPTION = "This package provides the Haskell bitvec profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.4.0"

RPM_NAME = "ghc-bitvec-prof-1.1.4.0-1.6.aarch64.rpm"
RPM_HASH = "6364265644050712dc074c49766366bd02d6190a8bb122eafc68fc0a033ff7871e7621c9683d10b4d31e858af18e7a9bd205f249c5a76fd28d6f9da4363d1545"

RPROVIDES:${PN} += "ghc-bitvec-prof \
ghc-prof-bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy"

RDEPENDS:${PN} += "ghc-bitvec-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
