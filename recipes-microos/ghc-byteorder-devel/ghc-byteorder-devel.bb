SUMMARY = "Haskell byteorder library development files"
DESCRIPTION = "This package provides the Haskell byteorder library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-devel-1.0.4-4.2.aarch64.rpm"
RPM_HASH = "1e7b224189eaa423ccbd2883845772f4e56876519ea9de8f321b70a35c7890d4e0aa356daae499a00bf3341c456a7ac046f29575fed9730ce48cb99cd66a2140"

RPROVIDES:${PN} += "ghc-byteorder-devel \
ghc-byteorder-devel(aarch-64) \
ghc-devel(byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl)"
RDEPENDS:${PN} += "/bin/sh \
ghc-byteorder \
ghc-compiler \
ghc-devel(base-4.17.1.0)"

inherit rpm
