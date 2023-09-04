SUMMARY = "Haskell hslua-cli profiling library"
DESCRIPTION = "This package provides the Haskell hslua-cli profiling library."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-prof-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "534af4a124e22218f8bbe1d80e57e9c8a649f062ce5a3b2d6ac87ce05c2954f999e3899acfa7879a9cbb08032deaa14e10dff15b0c724fb6c0e6e3d5121986b5"

RPROVIDES:${PN} += "ghc-hslua-cli-prof \
ghc-prof-hslua-cli-1.4.1-3ALOS2CE98w5DVmGh3IYfg"

RDEPENDS:${PN} += "ghc-hslua-cli-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-repl-0.1.1-AT3e5G0H4So5vj4IgGLSDC \
ghc-prof-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-prof-text-2.0.2 \
ghc-prof-unix-2.7.3"

inherit rpm
