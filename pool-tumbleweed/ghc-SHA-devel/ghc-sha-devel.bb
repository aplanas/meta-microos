SUMMARY = "Haskell SHA library development files"
DESCRIPTION = "This package provides the Haskell SHA library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-devel-1.6.4.4-8.2.aarch64.rpm"
RPM_HASH = "a510d6e70d779fed9e146175e39d13e00c892f6639f7f2e47cf4915e1dbd5a9e642cd281ed7206d56a67ebc7da3a56423e0e6f8a6bd4968e7c2845a92723e5dc"

RPROVIDES:${PN} += "ghc-SHA-devel \
ghc-devel-SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW"

RDEPENDS:${PN} += "/bin/sh \
ghc-SHA \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
