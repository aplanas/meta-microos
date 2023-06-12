SUMMARY = "Haskell regex-posix profiling library"
DESCRIPTION = "This package provides the Haskell regex-posix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-prof-0.96.0.1-3.3.aarch64.rpm"
RPM_HASH = "16636cd82a0baac6fc34093d9998ea91d223aa82860aeb507c152d9759578b64216a361f1895fe1736365246cf5ef2b7d5934ead98af0f11b6828384da504696"

RPROVIDES:${PN} += "ghc-prof(regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1) \
ghc-regex-posix-prof \
ghc-regex-posix-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) \
ghc-regex-posix-devel"

inherit rpm
