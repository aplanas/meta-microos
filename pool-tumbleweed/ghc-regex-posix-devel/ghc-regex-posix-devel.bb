SUMMARY = "Haskell regex-posix library development files"
DESCRIPTION = "This package provides the Haskell regex-posix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-devel-0.96.0.1-3.3.aarch64.rpm"
RPM_HASH = "7a24d6e769dd45efa8377cde30c2d2088bb610110bec1e6beee03d60fcfb722501c4653c9b5ec70ccea89d26e21aad0fc3978db72bfb7137f89d4b73df22d7ae"

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
