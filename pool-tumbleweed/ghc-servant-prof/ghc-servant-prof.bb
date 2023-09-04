SUMMARY = "Haskell servant profiling library"
DESCRIPTION = "This package provides the Haskell servant profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-prof-0.19.1-3.4.aarch64.rpm"
RPM_HASH = "8aa0454eccd86bf5d2bc42d2609a371ce24b47f3eb81ff170471c13a8e9bc2545e200e379c2bec33c739822a31f399be93197220c7ce01c9c8a87ce23e0b843a"

RPROVIDES:${PN} += "ghc-prof-servant-0.19.1-3gX0IvlAojJFGwbp2bDTQF \
ghc-servant-prof"

RDEPENDS:${PN} += "ghc-prof-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-constraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy \
ghc-prof-http-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-singleton-bool-0.1.6-32zI19nhSdNCZbR5BPJbeE \
ghc-prof-sop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD \
ghc-prof-string-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-servant-devel"

inherit rpm
