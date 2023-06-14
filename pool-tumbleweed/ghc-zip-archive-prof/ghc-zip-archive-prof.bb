SUMMARY = "Haskell zip-archive profiling library"
DESCRIPTION = "This package provides the Haskell zip-archive profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-zip-archive-prof-0.4.3-1.2.aarch64.rpm"
RPM_HASH = "c49c2c29047c78330663d7d6c2bfdb0f9aaf4c1aa35cf7c43119f9304d8aa2deb3f8af0a887be1dfb92844788494f50ad68616e73f953ae0a47a6eba9ef76a96"

RPROVIDES:${PN} += "ghc-prof-zip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn \
ghc-zip-archive-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-digest-0.0.1.7-CCCN8814sFy3HuiyT8t94G \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-zip-archive-devel"

inherit rpm
