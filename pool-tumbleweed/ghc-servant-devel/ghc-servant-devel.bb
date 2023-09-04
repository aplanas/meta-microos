SUMMARY = "Haskell servant library development files"
DESCRIPTION = "This package provides the Haskell servant library development files."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-devel-0.19.1-3.4.aarch64.rpm"
RPM_HASH = "19ea8f4a408dd72f952f0d510c05c789ff7cec7c41e44ff275ebd4e7a1570575be607b969e5dea709b8fb658228c1b52b503e5ddfdca645a227978015f68c3c5"

RPROVIDES:${PN} += "ghc-devel-servant-0.19.1-3gX0IvlAojJFGwbp2bDTQF \
ghc-servant-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-constraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy \
ghc-devel-http-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-singleton-bool-0.1.6-32zI19nhSdNCZbR5BPJbeE \
ghc-devel-sop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD \
ghc-devel-string-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-servant"

inherit rpm
