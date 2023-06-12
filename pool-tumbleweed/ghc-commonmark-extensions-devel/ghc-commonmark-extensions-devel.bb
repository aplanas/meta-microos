SUMMARY = "Haskell commonmark-extensions library development files"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.4"

RPM_NAME = "ghc-commonmark-extensions-devel-0.2.3.4-1.3.aarch64.rpm"
RPM_HASH = "ed65106a8708441d332c72b8934dd517d387f484d73f417cda5c5cb050d6e7b7b3b4deca0d70a7bfa9b2034a60bd38601e46635c5b5ef89d40a5a9ac831704f1"

RPROVIDES:${PN} += "ghc-commonmark-extensions-devel \
ghc-commonmark-extensions-devel(aarch-64) \
ghc-devel(commonmark-extensions-0.2.3.4-fvyaRimQueHtxCz9MhD8e)"
RDEPENDS:${PN} += "/bin/sh \
ghc-commonmark-extensions \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(commonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz) \
ghc-devel(containers-0.6.7) \
ghc-devel(emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2)"

inherit rpm
