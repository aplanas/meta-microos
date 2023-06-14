SUMMARY = "Haskell integer-logarithms library development files"
DESCRIPTION = "This package provides the Haskell integer-logarithms library development \
files."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-devel-1.0.3.1-6.3.aarch64.rpm"
RPM_HASH = "922f112204e46e5e44ca908d57335d763c91987e1e5363be85ee7baaba26a32d52ed9c0f82ed6ff56176fef3ad32623fcac4e4801c7eda12acf48786baddafca"

RPROVIDES:${PN} += "ghc-devel-integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu \
ghc-integer-logarithms-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-ghc-prim-0.9.0 \
ghc-integer-logarithms"

inherit rpm
