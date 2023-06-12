SUMMARY = "Haskell regex-tdfa profiling library"
DESCRIPTION = "This package provides the Haskell regex-tdfa profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "ghc-regex-tdfa-prof-1.3.2-2.3.aarch64.rpm"
RPM_HASH = "30d608a48fd7a9980d060bfe1206cdaccbb749b6c58ad44ac96b550a0593a77ee329a146f79c840ced15531d47af0fb2bf95d7cb87acbfcc90f52d7d641de644"

RPROVIDES:${PN} += "ghc-prof(regex-tdfa-1.3.2-CiIqW6NRXBXL0jfv03YXoU) \
ghc-regex-tdfa-prof \
ghc-regex-tdfa-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(mtl-2.2.2) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) \
ghc-prof(text-2.0.2) \
ghc-regex-tdfa-devel"

inherit rpm
