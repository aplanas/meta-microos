SUMMARY = "Haskell bsb-http-chunked profiling library"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-prof-0.0.0.4-6.2.aarch64.rpm"
RPM_HASH = "b9e7c6545af59a118372f2a062686b156c328e5d0dfba4c1b22fc166d4785ba1fe2ffad8f44a519a3f910e90e5f95fd5d5ee0a48bc1acee05cb42e51d49cd06f"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-prof \
ghc-bsb-http-chunked-prof(aarch-64) \
ghc-prof(bsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl)"

RDEPENDS:${PN} += "ghc-bsb-http-chunked-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
