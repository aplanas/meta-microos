SUMMARY = "Haskell typed-process library development files"
DESCRIPTION = "This package provides the Haskell typed-process library development files."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-devel-0.2.11.0-1.9.aarch64.rpm"
RPM_HASH = "fb99cfa3692fe165afcd13fbd714fe0e619acccb65e97f1ca565a9b791ef4d50f1a312c5fbd341ea11c4493804b9f7aa0571bc7933fa535304951435b78fce7e"

RPROVIDES:${PN} += "ghc-devel-typed-process-0.2.11.0-D02VU1fccqSD0M6BP6Pfz9 \
ghc-typed-process-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-process-1.6.17.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-typed-process"

inherit rpm
