SUMMARY = "Haskell th-abstraction library development files"
DESCRIPTION = "This package provides the Haskell th-abstraction library development files."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-devel-0.4.5.0-2.3.aarch64.rpm"
RPM_HASH = "d04de296b0da86f36665ebfd448ae5f6c8fc86cdf3ec38cc081a659eb45594521f4a4b4d0d2f007694cb3c2f8af747bae89451cd93f91430982c3837d869be5b"

RPROVIDES:${PN} += "ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-th-abstraction-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-th-abstraction"

inherit rpm
