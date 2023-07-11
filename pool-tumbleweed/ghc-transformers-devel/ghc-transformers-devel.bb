SUMMARY = "Haskell transformers library development files"
DESCRIPTION = "This package provides the Haskell transformers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-devel-0.5.6.2-3.2.aarch64.rpm"
RPM_HASH = "1357bad1e186094c2213ac05789979cff87280d65984b0d8d1907094588e9c73ef27c7399a8b1a5a4b921db42cc1d5fc0c830f3a872d9573bb301cb834eb552f"

RPROVIDES:${PN} += "ghc-devel-transformers-0.5.6.2 \
ghc-transformers-devel \
ghc-transformers-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-transformers"

inherit rpm
