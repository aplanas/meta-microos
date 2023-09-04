SUMMARY = "Haskell safe-exceptions library development files"
DESCRIPTION = "This package provides the Haskell safe-exceptions library development \
files."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-devel-0.1.7.4-1.2.aarch64.rpm"
RPM_HASH = "045fc7b5a9afb484c3836232bd71a122d0c58e5554135821c192bbf0732c9370bbc9eec2334b373854c54701a616fe3cbdf5cc68bf0352ed882c92074ddadaa6"

RPROVIDES:${PN} += "ghc-devel-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-safe-exceptions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-transformers-0.5.6.2 \
ghc-safe-exceptions"

inherit rpm
