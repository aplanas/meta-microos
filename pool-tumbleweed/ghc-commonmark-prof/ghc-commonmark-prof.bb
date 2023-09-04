SUMMARY = "Haskell commonmark profiling library"
DESCRIPTION = "This package provides the Haskell commonmark profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-commonmark-prof-0.2.3-1.4.aarch64.rpm"
RPM_HASH = "293f365deba37e4c9670147cbea276318a2b13e72f7c867239fb67e41d28821c7e588506bf1da40508a35767e2666a7d72100518706062753257590f429dfdf4"

RPROVIDES:${PN} += "ghc-commonmark-prof \
ghc-prof-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR"

RDEPENDS:${PN} += "ghc-commonmark-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr \
ghc-prof-unicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24"

inherit rpm
