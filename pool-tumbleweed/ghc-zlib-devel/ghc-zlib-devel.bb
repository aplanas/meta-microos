SUMMARY = "Haskell zlib library development files"
DESCRIPTION = "This package provides the Haskell zlib library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-devel-0.6.3.0-4.2.aarch64.rpm"
RPM_HASH = "9c65e3ca954aefa9fb2651d1e4020f1d7fde5176d247f26f2887fdd4d454c0dca052edd83ce148b7f21c05c0e2b42996729862d6d312ef86be1d8f2fffce24c6"

RPROVIDES:${PN} += "ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-zlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-zlib \
zlib-devel"

inherit rpm
