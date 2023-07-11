SUMMARY = "Haskell directory library development files"
DESCRIPTION = "This package provides the Haskell directory library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-devel-1.3.7.1-3.2.aarch64.rpm"
RPM_HASH = "5ab645fa0b44b3802f27da8c6b3ceba1f9ec5a898b2a5c702f0c45fbbfd18d7d51ed729dc660c8ec00cf4566c54ccfaf6fc9d1d21e6573777389cb2330627bac"

RPROVIDES:${PN} += "ghc-devel-directory-1.3.7.1 \
ghc-directory-devel \
ghc-directory-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-directory"

inherit rpm
