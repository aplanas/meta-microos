SUMMARY = "Haskell crypto-cipher-types library development files"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-devel-0.0.9-4.6.aarch64.rpm"
RPM_HASH = "5f852f119cc76029013de43f3e89c293e125d89e8e27d62d56334965b6bd944ce23a8de03851cfac74a6147575ecdb56c98349b778cf1f521b6881cb0887879f"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-devel \
ghc-devel-crypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-cipher-types \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu"

inherit rpm
