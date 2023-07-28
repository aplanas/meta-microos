SUMMARY = "Haskell extra profiling library"
DESCRIPTION = "This package provides the Haskell extra profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-prof-1.7.14-1.2.aarch64.rpm"
RPM_HASH = "c06db9b695cad13d40d0839615fb7b0734bb6b51a011cee31ba4f43ab962a7a70fdd81ebc823537e3c92b4075df674ecb20c4d92f397a15d860cfd763464e631"

RPROVIDES:${PN} += "ghc-extra-prof \
ghc-prof-extra-1.7.14-9MsHIUa0FAo4DKg07m0mTc"

RDEPENDS:${PN} += "ghc-extra-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-clock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3"

inherit rpm
