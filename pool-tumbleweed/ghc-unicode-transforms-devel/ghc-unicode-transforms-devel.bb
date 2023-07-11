SUMMARY = "Haskell unicode-transforms library development files"
DESCRIPTION = "This package provides the Haskell unicode-transforms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-devel-0.4.0.1-4.6.aarch64.rpm"
RPM_HASH = "9c68d33f0d939d1ae3837cc7588d33715266841891b91706638faa454c961bc08eb44f239bebd98035abcb03eaa44e5b94ab0ac2ff725d8e7c46949f7f744b34"

RPROVIDES:${PN} += "ghc-devel-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO \
ghc-unicode-transforms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-unicode-transforms"

inherit rpm
