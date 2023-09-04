SUMMARY = "Haskell http-types library development files"
DESCRIPTION = "This package provides the Haskell http-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-devel-0.12.3-6.9.aarch64.rpm"
RPM_HASH = "97a53c289c7591ce513746323cc85a8f3f8f8b07ed98918cbcaab747e2cac119fc7877b7ab5259fd488bb5ba30f294d3f4832ba0f8c17a3f5fce2e808d2ee274"

RPROVIDES:${PN} += "ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-http-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-text-2.0.2 \
ghc-http-types"

inherit rpm
