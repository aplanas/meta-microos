SUMMARY = "Haskell regex-tdfa library development files"
DESCRIPTION = "This package provides the Haskell regex-tdfa library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "ghc-regex-tdfa-devel-1.3.2-2.3.aarch64.rpm"
RPM_HASH = "4d1830fc5defb36811204d133befe591b4f7dc3b8918a316b36c3f7368530c2e99fc27adc40a67d4a160c9e5de3401fda6f97b20224db6488d70bc7ff66997c4"

RPROVIDES:${PN} += "ghc-devel-regex-tdfa-1.3.2-CiIqW6NRXBXL0jfv03YXoU \
ghc-regex-tdfa-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-devel-text-2.0.2 \
ghc-regex-tdfa"

inherit rpm
