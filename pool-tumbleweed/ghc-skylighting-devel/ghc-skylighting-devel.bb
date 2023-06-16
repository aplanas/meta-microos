SUMMARY = "Haskell skylighting library development files"
DESCRIPTION = "This package provides the Haskell skylighting library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.2.1"

RPM_NAME = "ghc-skylighting-devel-0.13.2.1-1.4.aarch64.rpm"
RPM_HASH = "bfacdee13560fc7abeca0461f8fb859c4bb673ebe23e4d2ca4ea2d957cd26fd0d2b96836a2d8b17b6fc11e0a571053700aa601b9e1b11a18a5e4f6d53ea3b3b7"

RPROVIDES:${PN} += "ghc-devel-skylighting-0.13.2.1-BFihQrd5v8J7nFEx17mOBW \
ghc-skylighting-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63 \
ghc-devel-skylighting-format-ansi-0.1-37mK2ZS7ued5gd5quPggBj \
ghc-devel-skylighting-format-blaze-html-0.1.1-GSLRiRB6bjcEjUjplnknYR \
ghc-devel-skylighting-format-context-0.1.0.2-KUO5o5IaP468SqsY1Sf1SB \
ghc-devel-skylighting-format-latex-0.1-BfMH5Wq0cc5AFSMLgsgxu \
ghc-skylighting"

inherit rpm
