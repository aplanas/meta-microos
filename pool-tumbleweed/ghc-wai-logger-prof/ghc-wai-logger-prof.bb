SUMMARY = "Haskell wai-logger profiling library"
DESCRIPTION = "This package provides the Haskell wai-logger profiling library."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-prof-2.4.0-2.3.aarch64.rpm"
RPM_HASH = "510346832149063776db5a5b5d1eadbc70c61dc46fd977bddcd03e54fd7fb92d2a09ee9fb3d75c9d047f7c6999b49749c9d12b88c9c90114cc1f96cac4d2e40a"

RPROVIDES:${PN} += "ghc-prof-wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0 \
ghc-wai-logger-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn \
ghc-wai-logger-devel"

inherit rpm
