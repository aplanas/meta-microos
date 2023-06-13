SUMMARY = "Haskell regex-base profiling library"
DESCRIPTION = "This package provides the Haskell regex-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-prof-0.94.0.2-3.3.aarch64.rpm"
RPM_HASH = "f1bce740ac43f1e816a0652ee7ebc5d82133be722eeee9fcf56206795c53d28a2f494b8b566ddfbfc3016afbfc591564adf268be46fa2ac248a9e62fc9110766"

RPROVIDES:${PN} += "ghc-prof(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) \
ghc-regex-base-prof \
ghc-regex-base-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(text-2.0.2) \
ghc-regex-base-devel"

inherit rpm
