SUMMARY = "Haskell zlib library development files"
DESCRIPTION = "This package provides the Haskell zlib library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-devel-0.6.3.0-3.1.aarch64.rpm"
RPM_HASH = "1d0420a05bdacc9050afa25c5106cc6a1207bb73ec421df752962a98aff0ca848e00f9e914da6dec99fb7f67931d243fde9d00581ccc0ee5cf1ec6fc175073c0"

RPROVIDES:${PN} += "ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-zlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-zlib \
zlib-devel"

inherit rpm
