SUMMARY = "Haskell vector-algorithms profiling library"
DESCRIPTION = "This package provides the Haskell vector-algorithms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-prof-0.9.0.1-1.3.aarch64.rpm"
RPM_HASH = "3a178a582f5d0df393e874296149b36a30c374b284b0d2807bd9f442565884cca73e16132d69684c0d46164492669bfba398b3ee80429be706acafc6a5cea993"

RPROVIDES:${PN} += "ghc-prof(vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6) \
ghc-vector-algorithms-prof \
ghc-vector-algorithms-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-vector-algorithms-devel"

inherit rpm
