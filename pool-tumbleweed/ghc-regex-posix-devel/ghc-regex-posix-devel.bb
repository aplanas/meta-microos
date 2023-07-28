SUMMARY = "Haskell regex-posix library development files"
DESCRIPTION = "This package provides the Haskell regex-posix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-devel-0.96.0.1-4.1.aarch64.rpm"
RPM_HASH = "a458e4923d9ab58354520ac58dd52b6daf37109699ff642c6f55655e893c05f9dd871e515d4e748ee96f9ffd8c26bed82c2b3e15ea8606c37821a90cd2928424"

RPROVIDES:${PN} += "ghc-devel-regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1 \
ghc-regex-posix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-posix"

inherit rpm
