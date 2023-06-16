SUMMARY = "Haskell network-info library development files"
DESCRIPTION = "This package provides the Haskell network-info library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-devel-0.2.1-2.2.aarch64.rpm"
RPM_HASH = "c2e71e27381278094a66a7e001eab508ee2dc748ab3b52c5da5d96da8342972618e6812fbc421d4bc5f246dc85a2ec0d2749558862a91c0457ede2b8e2d10036"

RPROVIDES:${PN} += "ghc-devel-network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I \
ghc-network-info-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-network-info"

inherit rpm
