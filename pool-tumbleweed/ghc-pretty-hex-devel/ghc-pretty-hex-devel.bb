SUMMARY = "Haskell pretty-hex library development files"
DESCRIPTION = "This package provides the Haskell pretty-hex library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-devel-1.1-4.3.aarch64.rpm"
RPM_HASH = "bf70a1cb467d4dd7f19cfbe96cc1f5781327066a98ac02cb99d73ad34d7f870b9b1c685733124da5e0d5b9b1e04529947243cecbed0473ab6e43c07028c740cc"

RPROVIDES:${PN} += "ghc-devel-pretty-hex-1.1-6nqTsc1Xx7vJSzZ0xX5VyC \
ghc-pretty-hex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-pretty-hex"

inherit rpm
