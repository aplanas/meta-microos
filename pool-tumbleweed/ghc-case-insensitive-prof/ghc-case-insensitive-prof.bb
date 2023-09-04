SUMMARY = "Haskell case-insensitive profiling library"
DESCRIPTION = "This package provides the Haskell case-insensitive profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-prof-1.2.1.0-6.4.aarch64.rpm"
RPM_HASH = "4c760b5a43ad6dc9d5217a8d4a9e2489f10321a9b7325184b91f5bd87cd5fdaa9adc39358e2c1039004030c1b5fe4fe9a43ead4933d152c5956147eb4355ff01"

RPROVIDES:${PN} += "ghc-case-insensitive-prof \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9"

RDEPENDS:${PN} += "ghc-case-insensitive-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-text-2.0.2"

inherit rpm
