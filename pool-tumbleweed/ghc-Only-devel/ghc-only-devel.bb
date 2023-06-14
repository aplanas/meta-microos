SUMMARY = "Haskell Only library development files"
DESCRIPTION = "This package provides the Haskell Only library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-devel-0.1-5.2.aarch64.rpm"
RPM_HASH = "d4efa62b3174a359b081cce6a98618fb474597ceb684c7bb044348f1497114cc63516fc27d347905114c71c168ec48612eb72833f76e74304a6b7abf74499601"

RPROVIDES:${PN} += "ghc-Only-devel \
ghc-devel-Only-0.1-ETd5YCT0TwGLbN8rgpgTS8"

RDEPENDS:${PN} += "/bin/sh \
ghc-Only \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
