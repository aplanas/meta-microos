SUMMARY = "Haskell zlib profiling library"
DESCRIPTION = "This package provides the Haskell zlib profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-prof-0.6.3.0-4.2.aarch64.rpm"
RPM_HASH = "646923f3c890df12d027731737a942f6e17fa18d85249a0f879f08ab03cb0712ec2d0d21ef6bb0f02488df217b9f7371fa77a1cbdc912548ec1a9ef3dcf9ac7a"

RPROVIDES:${PN} += "ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-zlib-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-zlib-devel"

inherit rpm
