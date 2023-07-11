SUMMARY = "Haskell wai-logger library development files"
DESCRIPTION = "This package provides the Haskell wai-logger library development files."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-devel-2.4.0-2.5.aarch64.rpm"
RPM_HASH = "b40b230c5a80e732e7d6b4acfdbd1341c19e6545448d79e27f0fb0124deab6eafcabc506a8f895a612dacb4570a622be130203c0285c5acf59f57fd3f02e1e8a"

RPROVIDES:${PN} += "ghc-devel-wai-logger-2.4.0-HFZNBDhfTBI6FWxvAW2OQE \
ghc-wai-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-logger"

inherit rpm
