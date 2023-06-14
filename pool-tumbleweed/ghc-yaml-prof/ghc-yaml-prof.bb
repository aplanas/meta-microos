SUMMARY = "Haskell yaml profiling library"
DESCRIPTION = "This package provides the Haskell yaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.0"

RPM_NAME = "ghc-yaml-prof-0.11.11.0-1.3.aarch64.rpm"
RPM_HASH = "66dcce708fc8255071ce48f75ef9c47ca02eee57306c2cc3cf3200eddd818f2c234ee0acdb17d06ccb21d9eb64cd746b6b0c0419c516d3364f28bcbc4af1fd3b"

RPROVIDES:${PN} += "ghc-prof-yaml-0.11.11.0-AM27xwJeGq9DNHRH5iLzHi \
ghc-yaml-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-libyaml-0.1.2-HGo47aMnIYAKZUBwKE0axw \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-yaml-devel"

inherit rpm
