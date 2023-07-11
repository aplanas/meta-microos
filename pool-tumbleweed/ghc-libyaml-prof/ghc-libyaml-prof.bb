SUMMARY = "Haskell libyaml profiling library"
DESCRIPTION = "This package provides the Haskell libyaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-prof-0.1.2-6.7.aarch64.rpm"
RPM_HASH = "fc94cde454ee5cdbc7e85954401588d8ed9f058930a83a13191069a3289cf9c0fba246ccc300e4518d32c7dfd991304cbce4736dacd04356479b84ff2fee2415"

RPROVIDES:${PN} += "ghc-libyaml-prof \
ghc-prof-libyaml-0.1.2-6Gx0z1LjMeG6dZCnkkkmHj"

RDEPENDS:${PN} += "ghc-libyaml-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv"

inherit rpm
