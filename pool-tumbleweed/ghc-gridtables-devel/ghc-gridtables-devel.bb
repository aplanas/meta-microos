SUMMARY = "Haskell gridtables library development files"
DESCRIPTION = "This package provides the Haskell gridtables library development files."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-devel-0.1.0.0-1.4.aarch64.rpm"
RPM_HASH = "7a9682acb65c1c1610065ee1c42d0c1fec6707d454b234812ec921518c33933e07f08b64558b95b5045fa48fbc5a09a9ab6065eed65635805ae379b32e152bf6"

RPROVIDES:${PN} += "ghc-devel-gridtables-0.1.0.0-Ih9NHzC29fxA826YvnxRsH \
ghc-gridtables-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-gridtables"

inherit rpm
