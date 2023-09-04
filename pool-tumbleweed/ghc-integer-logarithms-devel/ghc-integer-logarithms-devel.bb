SUMMARY = "Haskell integer-logarithms library development files"
DESCRIPTION = "This package provides the Haskell integer-logarithms library development \
files."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-devel-1.0.3.1-6.6.aarch64.rpm"
RPM_HASH = "053705bc1d5199c5e1b31a3aa09b90cfe1a7514da7970a77107effe105a3bb11ff72a78af885dad4f9a801c8dc8a754c1fc168324528508679e02437f889eef3"

RPROVIDES:${PN} += "ghc-devel-integer-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO \
ghc-integer-logarithms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-ghc-prim-0.9.1 \
ghc-integer-logarithms"

inherit rpm
