SUMMARY = "Haskell time library development files"
DESCRIPTION = "This package provides the Haskell time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-devel-1.12.2-3.1.aarch64.rpm"
RPM_HASH = "a3485dcb6c567c6df1f033b0011a35bdafb550e65644ea95cdf76d645c03c2254303d673401addc0f6299d383fe9469b13973eb9079b7202bf69b9f818a98d53"

RPROVIDES:${PN} += "ghc-devel-time-1.12.2 \
ghc-time-devel \
ghc-time-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-time"

inherit rpm
