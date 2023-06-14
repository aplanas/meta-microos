SUMMARY = "Haskell wai-logger library development files"
DESCRIPTION = "This package provides the Haskell wai-logger library development files."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-devel-2.4.0-2.3.aarch64.rpm"
RPM_HASH = "0ab0faf22f6365c84d255b15e303ab4354f7893ad8a4d3d17f985fadb43916addf0f6268018272f77678d32334926f008ef52413b68c2414e97978a01fd65361"

RPROVIDES:${PN} += "ghc-devel-wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0 \
ghc-wai-logger-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn \
ghc-wai-logger"

inherit rpm
