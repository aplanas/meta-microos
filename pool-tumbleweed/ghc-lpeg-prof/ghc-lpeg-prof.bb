SUMMARY = "Haskell lpeg profiling library"
DESCRIPTION = "This package provides the Haskell lpeg profiling library."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-prof-1.0.4-1.5.aarch64.rpm"
RPM_HASH = "8c40fc8fd9dd924fb0266c36a9aa05a8fed757155f337fc2a00503fafc1ac2f842ede55472c6d8426d98e72f9ead10f0cc7736e0f418f7ada836516ad329ba35"

RPROVIDES:${PN} += "ghc-lpeg-prof \
ghc-prof-lpeg-1.0.4-DiPCMqCZ1gDFL4TQ30W98B"

RDEPENDS:${PN} += "ghc-lpeg-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h"

inherit rpm
