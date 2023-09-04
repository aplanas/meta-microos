SUMMARY = "Haskell SHA profiling library"
DESCRIPTION = "This package provides the Haskell SHA profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-prof-1.6.4.4-8.3.aarch64.rpm"
RPM_HASH = "fff231b9bdf2b6a8c6486b300b1ef60ed84fb80f8918e5aad0a460b69b75dfb8c36049b82a46136960b481f775955b58a003866a5b362f61d64c2b1c79e5b586"

RPROVIDES:${PN} += "ghc-SHA-prof \
ghc-prof-SHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l"

RDEPENDS:${PN} += "ghc-SHA-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
