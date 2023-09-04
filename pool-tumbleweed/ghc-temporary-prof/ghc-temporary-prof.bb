SUMMARY = "Haskell temporary profiling library"
DESCRIPTION = "This package provides the Haskell temporary profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-prof-1.3-6.3.aarch64.rpm"
RPM_HASH = "9c6475afdf9bbf5a7583f97c6f5b3787232915ff0ec0b71302f3a4907342d9bdb04b5ca0ffd6715dc0cd32a3d0b6774a0f507379640e3b408883b0dc412fdc88"

RPROVIDES:${PN} += "ghc-prof-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-temporary-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-temporary-devel"

inherit rpm
