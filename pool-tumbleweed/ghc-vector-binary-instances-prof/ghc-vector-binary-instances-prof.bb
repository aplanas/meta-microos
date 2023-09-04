SUMMARY = "Haskell vector-binary-instances profiling library"
DESCRIPTION = "This package provides the Haskell vector-binary-instances profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-prof-0.2.5.2-6.2.aarch64.rpm"
RPM_HASH = "91bcdce4eb45c8f03f425d29f7eb4a2f6b74e9d4d07b44f47d366a561b06b4002317dabec37d2ee3b888a62ab22702227ee9e0f341ae3648bd63d0c6b0abc7d9"

RPROVIDES:${PN} += "ghc-prof-vector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW \
ghc-vector-binary-instances-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-binary-instances-devel"

inherit rpm
