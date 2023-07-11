SUMMARY = "Haskell wai-logger profiling library"
DESCRIPTION = "This package provides the Haskell wai-logger profiling library."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-prof-2.4.0-2.5.aarch64.rpm"
RPM_HASH = "9ce77799f905365fa63c2537168eceb443b6a6e2ea3ea9a9aa11c3515d63bde322050c651d7d1e954aab72ed956c37224d1199d486f3bcb478684c5148b23e72"

RPROVIDES:${PN} += "ghc-prof-wai-logger-2.4.0-HFZNBDhfTBI6FWxvAW2OQE \
ghc-wai-logger-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-logger-devel"

inherit rpm
