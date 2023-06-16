SUMMARY = "Haskell transformers-base library development files"
DESCRIPTION = "This package provides the Haskell transformers-base library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-devel-0.4.6-2.2.aarch64.rpm"
RPM_HASH = "b040a837d7cf2003a9acd95d3835b67e2e8cda4e286e7a542c00fcc2467bf194878af35d1cafe945c42e4fb36ff42ef7ef0043b40f8053fbde0f7d7b77ba7e37"

RPROVIDES:${PN} += "ghc-devel-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-transformers-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-transformers-base"

inherit rpm
