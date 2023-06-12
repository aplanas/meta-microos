SUMMARY = "Haskell cairo profiling library"
DESCRIPTION = "This package provides the Haskell cairo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.8.2"

RPM_NAME = "ghc-cairo-prof-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "b7823c2c2a268c4ddf6e6c74aaa240c2b957ef38980c8807b2b1d6a3fe332730435a7e806462c4f355456aad24cc4dcec705ac7b4361d61ba4dff9027391b58b"

RPROVIDES:${PN} += "ghc-cairo-prof \
ghc-cairo-prof(aarch-64) \
ghc-prof(cairo-0.13.8.2-84nOBKgVLz3788JDxxB5om)"
RDEPENDS:${PN} += "ghc-cairo-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(mtl-2.2.2) \
ghc-prof(text-2.0.2) \
ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q)"

inherit rpm
