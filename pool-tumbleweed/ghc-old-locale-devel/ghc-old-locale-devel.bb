SUMMARY = "Haskell old-locale library development files"
DESCRIPTION = "This package provides the Haskell old-locale library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-devel-1.0.0.7-13.3.aarch64.rpm"
RPM_HASH = "838fa331cadf4306c1cb24a356930e74e3a1901718d199273954a0dc232aa86bdcf87dc0c5f25d31e7ce377dbc6f772e48b5119f0b4d40b506a814b65b1bf1d0"

RPROVIDES:${PN} += "ghc-devel-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-old-locale-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-old-locale"

inherit rpm
