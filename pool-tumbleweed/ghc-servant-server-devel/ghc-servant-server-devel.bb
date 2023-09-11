SUMMARY = "Haskell servant-server library development files"
DESCRIPTION = "This package provides the Haskell servant-server library development files."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-devel-0.19.2-2.13.aarch64.rpm"
RPM_HASH = "b3815d7b0bd985f5362b18f70c6fe546e822817d296ffa57f43a6f33a094f537faff031c8dd18025036ee11fa635559bbb4b75b3aaca8fdde19540c2c1dc2d23"

RPROVIDES:${PN} += "ghc-devel-servant-server-0.19.2-7mZwAKg13bTKiqPrqXFWN4 \
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
ghc-devel-http-media-0.8.1.0-COFozQnKf3L2ra0cnOflYd \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-servant-0.19.1-3wkqjCY5ZM9IhGFtmRnyia \
ghc-devel-sop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD \
ghc-devel-string-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-app-static-3.1.7.4-GYm23xVACFBKSbu1JkCZl2 \
ghc-devel-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-servant-server"

inherit rpm
