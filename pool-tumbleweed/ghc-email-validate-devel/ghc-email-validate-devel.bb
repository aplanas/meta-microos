SUMMARY = "Haskell email-validate library development files"
DESCRIPTION = "This package provides the Haskell email-validate library development files."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.19"

RPM_NAME = "ghc-email-validate-devel-2.3.2.19-1.3.aarch64.rpm"
RPM_HASH = "d10c2846de35d0cabbaaba660dcfe4cf8d6b51a2b71ef663383af990592cd09695f872a288fe89ad2d48f2cd5dbb0b6c0185531b5585c62ecd16ebd89d4a30fc"

RPROVIDES:${PN} += "ghc-devel-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN \
ghc-email-validate-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-email-validate"

inherit rpm
