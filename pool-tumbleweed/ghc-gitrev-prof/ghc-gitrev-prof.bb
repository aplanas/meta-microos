SUMMARY = "Haskell gitrev profiling library"
DESCRIPTION = "This package provides the Haskell gitrev profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-prof-1.3.1-9.3.aarch64.rpm"
RPM_HASH = "49455ac27a196c02a448562ffd6e369bc49799f681ebf9b3e8e7dd7a46ed396bacceae80fa57067360af29ad5ff86bb79678cabdd5f093eba4af2dd038a3609d"

RPROVIDES:${PN} += "ghc-gitrev-prof \
ghc-prof-gitrev-1.3.1-CQYGfdCfGPeA3DF217wQTZ"

RDEPENDS:${PN} += "ghc-gitrev-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
