SUMMARY = "Haskell magic library development files"
DESCRIPTION = "This package provides the Haskell magic library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-devel-1.1-4.6.aarch64.rpm"
RPM_HASH = "fbbff9e8cf42c46063b5ec87d39630728078850ba9ecf0327450e9fd85e60694d63fc4a1cc0b6d872d3cce22845514d9faf5dfe9aca7537af51945d6dcc99b48"

RPROVIDES:${PN} += "ghc-devel-magic-1.1-FZjtT3pxmlr6oRrs4QNuLe \
ghc-magic-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
file-devel \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-magic"

inherit rpm
