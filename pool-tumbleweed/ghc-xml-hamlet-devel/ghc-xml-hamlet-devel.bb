SUMMARY = "Haskell xml-hamlet library development files"
DESCRIPTION = "This package provides the Haskell xml-hamlet library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-devel-0.5.0.2-2.4.aarch64.rpm"
RPM_HASH = "47f96395b7ce511319f373f349e74baed816aa5bc51070892fdc0b5befb7fcdd611d87dc38dbcf907af4e21234bea7df64597baa9c486638a7d58f8408cbc1a7"

RPROVIDES:${PN} += "ghc-devel-xml-hamlet-0.5.0.2-9plFeNSOBanqhTw6DrwhP \
ghc-xml-hamlet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-xml-hamlet"

inherit rpm
