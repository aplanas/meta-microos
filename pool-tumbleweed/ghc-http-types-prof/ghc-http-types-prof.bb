SUMMARY = "Haskell http-types profiling library"
DESCRIPTION = "This package provides the Haskell http-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-prof-0.12.3-6.9.aarch64.rpm"
RPM_HASH = "8dfd04dd092f9322d0be02381836e6bde075af03be038ac05a87be264f68b9fdbda67e5d81d7bf0e66af2f00bcb23cc587f314a77a5c8c657476778f8de663a5"

RPROVIDES:${PN} += "ghc-http-types-prof \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p"

RDEPENDS:${PN} += "ghc-http-types-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-text-2.0.2"

inherit rpm
