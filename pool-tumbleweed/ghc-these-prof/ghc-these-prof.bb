SUMMARY = "Haskell these profiling library"
DESCRIPTION = "This package provides the Haskell these profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.1"

RPM_NAME = "ghc-these-prof-1.1.1.1-9.3.aarch64.rpm"
RPM_HASH = "997cdc013c5fbb7cc8d5764725a6a4c9834563791cd0b61c500d150fa70b74ec29c64f54e68ecc23c1b6ffc380b419e109ff73bd96e8c1ec654557a571d66816"

RPROVIDES:${PN} += "ghc-prof-these-1.1.1.1-3POHYes25uBIW53bcrDd39 \
ghc-these-prof"

RDEPENDS:${PN} += "ghc-prof-assoc-1.0.2-IAwklVGxRFw6xcadvaWWl7 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-these-devel"

inherit rpm
