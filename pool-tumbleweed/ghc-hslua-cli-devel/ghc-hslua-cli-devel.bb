SUMMARY = "Haskell hslua-cli library development files"
DESCRIPTION = "This package provides the Haskell hslua-cli library development files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-devel-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "c39618f8db91845b0fd2bf0f955608ad8f6b1e1c7119a7e4af9a3f47f6f63b1cb90200b52e79a41dd6776b2fb4eb3f25ac551237892ae12fb8d89bfb41ba247e"

RPROVIDES:${PN} += "ghc-devel-hslua-cli-1.4.1-3ALOS2CE98w5DVmGh3IYfg \
ghc-hslua-cli-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-repl-0.1.1-AT3e5G0H4So5vj4IgGLSDC \
ghc-devel-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-devel-text-2.0.2 \
ghc-devel-unix-2.7.3 \
ghc-hslua-cli"

inherit rpm
