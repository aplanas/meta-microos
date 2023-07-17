SUMMARY = "Haskell texmath profiling library"
DESCRIPTION = "This package provides the Haskell texmath profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-prof-0.12.8-1.3.aarch64.rpm"
RPM_HASH = "292d7fcb8e582ec592fbb1897b09e07fca275974cf2da95f459f7356e1c62bde3ca216785add6a83eab1404513c4a9a7c1153d2338d090eb1e073862f9617201"

RPROVIDES:${PN} += "ghc-prof-texmath-0.12.8-2W1fkH7eNmw4E7l7odwRHx \
ghc-texmath-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-text-2.0.2 \
ghc-prof-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-prof-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-texmath-devel"

inherit rpm
