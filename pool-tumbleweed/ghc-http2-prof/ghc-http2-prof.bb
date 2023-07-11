SUMMARY = "Haskell http2 profiling library"
DESCRIPTION = "This package provides the Haskell http2 profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-prof-3.0.3-2.7.aarch64.rpm"
RPM_HASH = "8bbf2e164f5c7e0b26ddd36952bea2b8eeb1ed37169868fbd175165eac1468ec541164eb6c8825511a5a9062f8ad3faaf90f3108bf4e0e34cd611c5031da27b1"

RPROVIDES:${PN} += "ghc-http2-prof \
ghc-prof-http2-3.0.3-COVYRU9DHikEztQPG0mdmy"

RDEPENDS:${PN} += "ghc-http2-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO \
ghc-prof-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj \
ghc-prof-unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0"

inherit rpm
