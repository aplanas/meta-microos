SUMMARY = "Haskell filepath-bytestring library development files"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.12"

RPM_NAME = "ghc-filepath-bytestring-devel-1.4.2.1.12-1.3.aarch64.rpm"
RPM_HASH = "5b96d76d4d485cd8800f6d94c63a459abc839808bdaad7ae76ad613deb90996dab66c66468e010519a191b37140b5ba5335e2546a8ddf9787cd04c8f87078fac"

RPROVIDES:${PN} += "ghc-devel-filepath-bytestring-1.4.2.1.12-j7n9rVANDcF3su3QaU7xU \
ghc-filepath-bytestring-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-unix-2.7.3 \
ghc-filepath-bytestring"

inherit rpm
