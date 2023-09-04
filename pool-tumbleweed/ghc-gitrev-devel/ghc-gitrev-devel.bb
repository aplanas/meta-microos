SUMMARY = "Haskell gitrev library development files"
DESCRIPTION = "This package provides the Haskell gitrev library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-devel-1.3.1-9.4.aarch64.rpm"
RPM_HASH = "a811416477d5c05e23bcc8432c866cfb32aa08d2384e22364a152b66f640c2ac2bdaec6ab7d9e7f5adda0c5b482f06b9ea8748a1683ae74383e4706155bb570b"

RPROVIDES:${PN} += "ghc-devel-gitrev-1.3.1-9Q0DldHbAfz2pygdzHH3jX \
ghc-gitrev-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-gitrev"

inherit rpm
