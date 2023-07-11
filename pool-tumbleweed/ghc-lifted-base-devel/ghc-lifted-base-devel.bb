SUMMARY = "Haskell lifted-base library development files"
DESCRIPTION = "This package provides the Haskell lifted-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-devel-0.2.3.12-8.6.aarch64.rpm"
RPM_HASH = "413c38abef0414a06a0748ea2dbf415981ac1b505cadcd83c5cc1f86c21e8b080f03b7189de234d495acc71888d5970c4b6268e051bad76fb2bc7b93e86e2007"

RPROVIDES:${PN} += "ghc-devel-lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo \
ghc-lifted-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-devel-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-lifted-base"

inherit rpm
