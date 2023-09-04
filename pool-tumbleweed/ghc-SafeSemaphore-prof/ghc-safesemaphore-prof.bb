SUMMARY = "Haskell SafeSemaphore profiling library"
DESCRIPTION = "This package provides the Haskell SafeSemaphore profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-prof-0.10.1-5.8.aarch64.rpm"
RPM_HASH = "bc43ed9c667ae1e59c6f6d99ffcc9db7112b2c31a4709e435449e7848690c5bd78c5b43efeda9a36a3b33113c3f1f65e5ffb293d490302ae534c351409e7f98d"

RPROVIDES:${PN} += "ghc-SafeSemaphore-prof \
ghc-prof-SafeSemaphore-0.10.1-8vfV4kQtVdq7fGz6bQJt9f"

RDEPENDS:${PN} += "ghc-SafeSemaphore-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-stm-2.5.1.0"

inherit rpm
