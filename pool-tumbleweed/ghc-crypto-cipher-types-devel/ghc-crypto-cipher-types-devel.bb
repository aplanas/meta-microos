SUMMARY = "Haskell crypto-cipher-types library development files"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-devel-0.0.9-4.8.aarch64.rpm"
RPM_HASH = "aa17f1dddd7530ff5b7ed997978e5631bba0a07076574c2952fa2f00b5f34c5a597c18bd47f464321d8315794eda2562e383282a580df1581ac1facaeab69e1d"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-devel \
ghc-devel-crypto-cipher-types-0.0.9-6FlBjXMHauN3ENUNZLdeKl"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-cipher-types \
ghc-devel-base-4.17.2.0 \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4"

inherit rpm
