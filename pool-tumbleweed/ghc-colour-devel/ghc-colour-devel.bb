SUMMARY = "Haskell colour library development files"
DESCRIPTION = "This package provides the Haskell colour library development files."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-devel-2.3.6-2.6.aarch64.rpm"
RPM_HASH = "d9f6addfc234b523f9cef3cefc5031f6d82f570674f0c0f0ac387ba3083b827527611ab3c66b541ea124169a95ca8f1cd3c1c086421ce03bdaaedc0b717d96bf"

RPROVIDES:${PN} += "ghc-colour-devel \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-colour \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
