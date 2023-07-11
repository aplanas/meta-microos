SUMMARY = "Haskell sandi profiling library"
DESCRIPTION = "This package provides the Haskell sandi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-prof-0.5-5.7.aarch64.rpm"
RPM_HASH = "88e188e84bfd7af3fc0bf6c54e579da8045a7c17ef16fc869022edee95b26776d723220304164badb91669947af1ddb537275243617d7f003e307c57d00547b3"

RPROVIDES:${PN} += "ghc-prof-sandi-0.5-YnddZGVezcGXuCMoeOLq4 \
ghc-sandi-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-exceptions-0.10.5 \
ghc-sandi-devel"

inherit rpm
