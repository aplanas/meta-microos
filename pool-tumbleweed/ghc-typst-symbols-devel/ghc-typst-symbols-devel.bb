SUMMARY = "Haskell typst-symbols library development files"
DESCRIPTION = "This package provides the Haskell typst-symbols library development files."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-typst-symbols-devel-0.1.4-1.1.aarch64.rpm"
RPM_HASH = "f08e6a384c3afcfade1e3fc379b9e85cff08f568f36b6e9d643d90e6a9e1bc7b07e510d7f55f51709245d095913eb24c65d50bd4abab62290ced14123b0a1256"

RPROVIDES:${PN} += "ghc-devel-typst-symbols-0.1.4-JaoP2leChnCACsgYhrK1kO \
ghc-typst-symbols-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-text-2.0.2 \
ghc-typst-symbols"

inherit rpm
