SUMMARY = "Haskell byteable library development files"
DESCRIPTION = "This package provides the Haskell byteable library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-devel-0.1.1-12.3.aarch64.rpm"
RPM_HASH = "5a25adeb991c55f62b381e83cae6d5d9ef3c7ce976866ab407efa305694997805107d53b03a1cf258117755c388094bfb848b7c0b7eb9436f41f1ffbcfd70306"

RPROVIDES:${PN} += "ghc-byteable-devel \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-byteable \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
