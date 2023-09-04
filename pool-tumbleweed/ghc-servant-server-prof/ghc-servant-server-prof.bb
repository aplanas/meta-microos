SUMMARY = "Haskell servant-server profiling library"
DESCRIPTION = "This package provides the Haskell servant-server profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-prof-0.19.2-2.12.aarch64.rpm"
RPM_HASH = "35e823f0f98cdcbed5784de173216e59801ad18373c5d93bb3d34d6f6566a487449b284efc44533974ad451acf5085923b350bafd35a94d101b2a58830017919"

RPROVIDES:${PN} += "ghc-prof-servant-server-0.19.2-7444o9ZjHDc4tKFECJOEz2 \
ghc-servant-server-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-constraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy \
ghc-prof-http-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-servant-0.19.1-3gX0IvlAojJFGwbp2bDTQF \
ghc-prof-sop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD \
ghc-prof-string-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-app-static-3.1.7.4-4gPGtaPPrElL5voDUXdKV2 \
ghc-prof-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-servant-server-devel"

inherit rpm
