SUMMARY = "Haskell network-uri library development files"
DESCRIPTION = "This package provides the Haskell network-uri library development files."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-devel-2.6.4.2-2.6.aarch64.rpm"
RPM_HASH = "87f9c6a2a079d4b3eabf55a008d44f2315e6dea975df6a29087d54ee0fd016020f0db231a94090cf1f4ae5c98d8331d9f1967afc3aadc6f125f65e95656f8bd2"

RPROVIDES:${PN} += "ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-network-uri-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv \
ghc-network-uri"

inherit rpm
