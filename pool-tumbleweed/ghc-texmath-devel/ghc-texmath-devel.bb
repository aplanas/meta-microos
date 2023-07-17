SUMMARY = "Haskell texmath library development files"
DESCRIPTION = "This package provides the Haskell texmath library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-devel-0.12.8-1.3.aarch64.rpm"
RPM_HASH = "c0881c784c4ed38d553211a60db225d224d0a6f920f87a2699be45cf1d72a9b1b825e529b8635f9e67e8b0a4b51754b593af3af14bce1216d6e5acef199ab887"

RPROVIDES:${PN} += "ghc-devel-texmath-0.12.8-2W1fkH7eNmw4E7l7odwRHx \
ghc-texmath-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-devel-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-texmath"

inherit rpm
