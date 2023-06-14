SUMMARY = "Haskell zip-archive library development files"
DESCRIPTION = "This package provides the Haskell zip-archive library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-zip-archive-devel-0.4.3-1.2.aarch64.rpm"
RPM_HASH = "c75093d8c4b88367254c2ff7042bfd3135f089dad40ff60465a6643b39d0c16da2e57f14e24616b329e295c8069fc36e813b563acbba476b255af84a50139255"

RPROVIDES:${PN} += "ghc-devel-zip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn \
ghc-zip-archive-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-digest-0.0.1.7-CCCN8814sFy3HuiyT8t94G \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-zip-archive"

inherit rpm
