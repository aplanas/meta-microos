SUMMARY = "Haskell recv library development files"
DESCRIPTION = "This package provides the Haskell recv library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-devel-0.1.0-1.7.aarch64.rpm"
RPM_HASH = "e76614cf19f30d8ba46f1229e409b5a98f4876a7c3a2ffe70354855ef9fba3f4509777fb8a82b01592d1dc7a3c204d3cf26e66bb5e9d99e8a7598c3809cf07c6"

RPROVIDES:${PN} += "ghc-devel-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-recv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-recv"

inherit rpm
