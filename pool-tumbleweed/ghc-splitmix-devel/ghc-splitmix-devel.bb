SUMMARY = "Haskell splitmix library development files"
DESCRIPTION = "This package provides the Haskell splitmix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-devel-0.1.0.4-4.6.aarch64.rpm"
RPM_HASH = "3b8f604196e3c1ca3b47465b032a7c2027262a7118636c0a987b00ccfc0f8733a514d1ef359cef7a517953c6e7923d4508844d5a47291ac8c6429dbb93d24f47"

RPROVIDES:${PN} += "ghc-devel-splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe \
ghc-splitmix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-splitmix"

inherit rpm
