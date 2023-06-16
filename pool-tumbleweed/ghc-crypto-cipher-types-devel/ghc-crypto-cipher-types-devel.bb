SUMMARY = "Haskell crypto-cipher-types library development files"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-devel-0.0.9-4.3.aarch64.rpm"
RPM_HASH = "ed9cd2c43fd64a963d3caf7f9681801498e2f45ddad97c64e1faf4903d1909e38b33c66e2df4630434c1fec09c7651c7f2eacc00ac6c1e9d663ce5a8895bd7a6"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-devel \
ghc-devel-crypto-cipher-types-0.0.9-4A4LPNV9DwQ1VQ3vwUnE52"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-cipher-types \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ"

inherit rpm
