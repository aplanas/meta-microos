SUMMARY = "Haskell indexed-traversable library development files"
DESCRIPTION = "This package provides the Haskell indexed-traversable library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-devel-0.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "a86af8dba347532c10cb95245717699d3e9bf39cd9e9681cd9421c5f2f2ddff79e03275c779159cf5095957c1cc3e5096b0c47b63d58776239603cf32b1781b7"

RPROVIDES:${PN} += "ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-indexed-traversable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-transformers-0.5.6.2 \
ghc-indexed-traversable"

inherit rpm
