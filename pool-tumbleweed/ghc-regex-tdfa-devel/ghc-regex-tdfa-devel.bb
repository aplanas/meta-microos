SUMMARY = "Haskell regex-tdfa library development files"
DESCRIPTION = "This package provides the Haskell regex-tdfa library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.2"

RPM_NAME = "ghc-regex-tdfa-devel-1.3.2.2-1.3.aarch64.rpm"
RPM_HASH = "41942ce6daa2b037daae38a6c09db616395542128cdfa5a74de8a676d3314a1ddc0c24301a389fd1bb6dd6e8c40759fd79fc3ff7e5c05190a509005caaf49228"

RPROVIDES:${PN} += "ghc-devel-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-regex-tdfa-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-devel-text-2.0.2 \
ghc-regex-tdfa"

inherit rpm
