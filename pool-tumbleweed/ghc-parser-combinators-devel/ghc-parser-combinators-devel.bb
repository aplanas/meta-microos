SUMMARY = "Haskell parser-combinators library development files"
DESCRIPTION = "This package provides the Haskell parser-combinators library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-devel-1.3.0-2.6.aarch64.rpm"
RPM_HASH = "ae4af75a9d23463a070c53449c8d604586e0113959337dc2887a783f74a7fd971300c25d066b63d5e723d0ffbaacf3c0990ee895906e5b7f4a06ef44e65a7b92"

RPROVIDES:${PN} += "ghc-devel-parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt \
ghc-parser-combinators-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-parser-combinators"

inherit rpm
