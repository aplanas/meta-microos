SUMMARY = "Haskell servant-server library development files"
DESCRIPTION = "This package provides the Haskell servant-server library development files."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-devel-0.19.2-2.12.aarch64.rpm"
RPM_HASH = "e5eff6c8c8233dce35df6e402f9f0e3ebfe26b0e43f9e96b3b132f1e8ef3bc8b52c4e2d950022af4dc896c9c65b056cfd49662d4e15bd08f2f3082054e7e6b76"

RPROVIDES:${PN} += "ghc-devel-servant-server-0.19.2-7444o9ZjHDc4tKFECJOEz2 \
ghc-servant-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-constraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy \
ghc-devel-http-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-servant-0.19.1-3gX0IvlAojJFGwbp2bDTQF \
ghc-devel-sop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD \
ghc-devel-string-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-app-static-3.1.7.4-4gPGtaPPrElL5voDUXdKV2 \
ghc-devel-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-servant-server"

inherit rpm
