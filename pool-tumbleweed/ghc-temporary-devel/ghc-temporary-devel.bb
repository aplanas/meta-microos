SUMMARY = "Haskell temporary library development files"
DESCRIPTION = "This package provides the Haskell temporary library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-devel-1.3-6.3.aarch64.rpm"
RPM_HASH = "5f596bf0e8baa42e2a930eef5011f7d1bbbebc0b50e051e0176aa79053acab59bcb5307ca1c4546d38df2e179ac4cdbac8e8cf440f09c7b3140fd50e2d119b73"

RPROVIDES:${PN} += "ghc-devel-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-temporary-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-temporary"

inherit rpm
