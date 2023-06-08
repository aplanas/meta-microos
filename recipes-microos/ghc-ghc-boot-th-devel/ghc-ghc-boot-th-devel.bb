SUMMARY = "Haskell ghc-boot-th library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-devel-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "11ad49c1d9177ece5939a4563ca21040406343ecaae13be86a39290744a299626fe8fe730ed357c6f5bc4bc12cb3272d70c3d64b34a0bfe7ee27e6052b682287"

RPROVIDES:${PN} += "ghc-devel(ghc-boot-th-9.4.5) ghc-ghc-boot-th-devel ghc-ghc-boot-th-devel(aarch-64) ghc-ghc-boot-th-static ghc-ghc-boot-th-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-ghc-boot-th(aarch-64)"

inherit rpm
