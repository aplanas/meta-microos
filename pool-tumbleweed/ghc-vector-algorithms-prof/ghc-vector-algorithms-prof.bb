SUMMARY = "Haskell vector-algorithms profiling library"
DESCRIPTION = "This package provides the Haskell vector-algorithms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-prof-0.9.0.1-1.6.aarch64.rpm"
RPM_HASH = "90977c16e5b60290005bcb1a95463b920da88fe86b13a1f46f848e6fdfe8ba81d37484dd8dd4c3fc11cedc0a5b8eb655ada448b6d5a93653ebe6fecd0502d53b"

RPROVIDES:${PN} += "ghc-prof-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6 \
ghc-vector-algorithms-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-vector-algorithms-devel"

inherit rpm
