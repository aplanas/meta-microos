SUMMARY = "Haskell text-short library development files"
DESCRIPTION = "This package provides the Haskell text-short library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-devel-0.1.5-3.8.aarch64.rpm"
RPM_HASH = "e6ebb0b0869295e78b4d44002ca9a58062fce7d32d04a0cf79bb2e6bb35c11b06e2e476a3ce139c685ad8b89f98f1d77940dd94240fa14fa3c42964c94a1c406"

RPROVIDES:${PN} += "ghc-devel-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez \
ghc-text-short-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-text-short"

inherit rpm
