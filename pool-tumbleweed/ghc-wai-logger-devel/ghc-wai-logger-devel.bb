SUMMARY = "Haskell wai-logger library development files"
DESCRIPTION = "This package provides the Haskell wai-logger library development files."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-devel-2.4.0-2.6.aarch64.rpm"
RPM_HASH = "f6eb6c9f2a44b3bf247cfbce685bfae3429eb9f4ed717f4d0cf41fce443eba5e73222900cd983f3b707121795da7d0361f67d8d53f97d9c8e667c8df1297559d"

RPROVIDES:${PN} += "ghc-devel-wai-logger-2.4.0-JuVFE6hpBhqDKHgP60Zmqn \
ghc-wai-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-logger"

inherit rpm
