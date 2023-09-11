SUMMARY = "Haskell ghc-lib-parser-ex library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library development \
files."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-devel-9.4.0.0-1.12.aarch64.rpm"
RPM_HASH = "f26132fdec05cb5d3873ec13e85d93f19d4f2af4153417a45f95e8307d5918e836477efcd50c85ccd09784e5a79fa5716d93151fd2fd161720fa55d9fea33ec1"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-ex-9.4.0.0-5gI0mYE7T3L4MUgurM5BvD \
ghc-ghc-lib-parser-ex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU \
ghc-devel-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-ghc-lib-parser-ex"

inherit rpm
