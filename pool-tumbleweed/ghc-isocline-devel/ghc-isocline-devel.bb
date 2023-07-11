SUMMARY = "Haskell isocline library development files"
DESCRIPTION = "This package provides the Haskell isocline library development files."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-devel-1.0.9-1.6.aarch64.rpm"
RPM_HASH = "8cc55d25609da1360534647665cb32accb28d7a589d78fc822afd0a9eebcd3632a2a9ea0d47331661408831440bc9e2b829670bbdd36f62160c716ba4fe725a3"

RPROVIDES:${PN} += "ghc-devel-isocline-1.0.9-7x8dFWbXh69GJxYhigSqXG \
ghc-isocline-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2 \
ghc-isocline"

inherit rpm
