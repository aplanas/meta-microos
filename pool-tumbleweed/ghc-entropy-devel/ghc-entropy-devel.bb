SUMMARY = "Haskell entropy library development files"
DESCRIPTION = "This package provides the Haskell entropy library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-devel-0.4.1.10-3.2.aarch64.rpm"
RPM_HASH = "88ce23004c9341cbbd916c194a28934e3753ca9b086653268e5a9fbc8323ff5d97a4ded700e40bef70179f631048b6584bd05fc219c2a71f93a7039c4dcacc2e"

RPROVIDES:${PN} += "ghc-devel(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) \
ghc-entropy-devel \
ghc-entropy-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(unix-2.7.3) \
ghc-entropy"

inherit rpm
