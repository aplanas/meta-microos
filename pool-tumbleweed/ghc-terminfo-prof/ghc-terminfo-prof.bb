SUMMARY = "Haskell terminfo profiling library"
DESCRIPTION = "This package provides the Haskell terminfo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-prof-0.4.1.5-1.1.aarch64.rpm"
RPM_HASH = "f8a25a383a75a45cf7868d23217723b563a49dfb2f45a3f33d66a40764b99d65eea51c7e4c96ac434da36fdce28c5e02735ffe49def89a61e7c12a913dddb724"

RPROVIDES:${PN} += "ghc-prof-terminfo-0.4.1.5 \
ghc-terminfo-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-terminfo-devel"

inherit rpm
