SUMMARY = "Haskell githash library development files"
DESCRIPTION = "This package provides the Haskell githash library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.3"

RPM_NAME = "ghc-githash-devel-0.1.6.3-2.3.aarch64.rpm"
RPM_HASH = "f625ebdcd8e5132f6f8b67b7d7c1e7672725badd392cebbb996ba7c0473753f3f87494a4465b16d43e5dfa55b3181e149465fcef2b0088877ca8a10d1edfa8be"

RPROVIDES:${PN} += "ghc-devel-githash-0.1.6.3-FrkvdbOWDB4772dnMETpxS \
ghc-githash-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv \
ghc-githash"

inherit rpm
