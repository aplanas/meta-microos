SUMMARY = "Haskell wai-logger profiling library"
DESCRIPTION = "This package provides the Haskell wai-logger profiling library."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-prof-2.4.0-2.6.aarch64.rpm"
RPM_HASH = "fceb5e3141a1dad14e7ea42b0a63fe8cb6b09fe811254338fbc907b0161c9995002f333fedadae31f100f1d92688c938e0b4c3d43f4f9fe471316ffd1ef6b6b6"

RPROVIDES:${PN} += "ghc-prof-wai-logger-2.4.0-JuVFE6hpBhqDKHgP60Zmqn \
ghc-wai-logger-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-logger-devel"

inherit rpm
