SUMMARY = "Haskell zlib profiling library"
DESCRIPTION = "This package provides the Haskell zlib profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-prof-0.6.3.0-2.6.aarch64.rpm"
RPM_HASH = "41961fb40a8460c2614510e42ebb27e22a2ce59b22025770da2aceae41c68974d2c2a870205da62b785306fd054f9acf33d77a623249a3318486d82f6e8e6399"

RPROVIDES:${PN} += "ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-zlib-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-zlib-devel"

inherit rpm
