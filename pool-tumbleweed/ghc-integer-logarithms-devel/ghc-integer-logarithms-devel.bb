SUMMARY = "Haskell integer-logarithms library development files"
DESCRIPTION = "This package provides the Haskell integer-logarithms library development \
files."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-devel-1.0.3.1-6.5.aarch64.rpm"
RPM_HASH = "a970cb3c7ff5b54208e8e0a08dbf538b0378c2f6ccf1f6f71640605ec01a827f8346148d625882c1c3f7cb6d0915a6adb7fa4ce6953f5cadb9ca629782a78ca2"

RPROVIDES:${PN} += "ghc-devel-integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu \
ghc-integer-logarithms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-ghc-prim-0.9.0 \
ghc-integer-logarithms"

inherit rpm
