SUMMARY = "Haskell hslua-repl profiling library"
DESCRIPTION = "This package provides the Haskell hslua-repl profiling library."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-hslua-repl-prof-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "b6f15e88667f3cdcf64393cb000a4ef9efb4dda1bc6dd910060895b26998dba6b59e5c53a3ddabd6fa0a5ab39b83f98c4e503cd1d57105d053070c8a0d79d2cc"

RPROVIDES:${PN} += "ghc-hslua-repl-prof \
ghc-prof-hslua-repl-0.1.1-AT3e5G0H4So5vj4IgGLSDC"

RDEPENDS:${PN} += "ghc-hslua-repl-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-isocline-1.0.9-5gDpTZgmtmsDJNf9j9fI7b \
ghc-prof-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-prof-text-2.0.2"

inherit rpm
