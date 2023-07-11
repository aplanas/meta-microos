SUMMARY = "Haskell streaming-commons library development files"
DESCRIPTION = "This package provides the Haskell streaming-commons library development \
files."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-devel-0.2.2.6-1.7.aarch64.rpm"
RPM_HASH = "6101a2d2e6f918b0e334383dab8863cd83bf70ba2ecbc4dd84fea456213390f68746bff85bd47649c7c2f70faf0e461cd2d35cb02f2923407610ec047527a6d9"

RPROVIDES:${PN} += "ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-streaming-commons-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-process-1.6.16.0 \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-stm-2.5.1.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-streaming-commons"

inherit rpm
