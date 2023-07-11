SUMMARY = "Haskell commonmark-extensions profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.4"

RPM_NAME = "ghc-commonmark-extensions-prof-0.2.3.4-1.7.aarch64.rpm"
RPM_HASH = "71d75b6e539e7162819b4287716aa88b978286a2fc5b4cce3d38d85c7e7ba49f6ec7318a603116eb8b403128bebbfc59bdad4c46ad81f33d21c36b1855926ba5"

RPROVIDES:${PN} += "ghc-commonmark-extensions-prof \
ghc-prof-commonmark-extensions-0.2.3.4-lgOKfz42TuIWz23FZS91J"

RDEPENDS:${PN} += "ghc-commonmark-extensions-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-prof-containers-0.6.7 \
ghc-prof-emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
