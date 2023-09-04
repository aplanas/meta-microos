SUMMARY = "Haskell hslua-module-path library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-path library development \
files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-devel-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "c60e418732cd94aedc6b2f881ce4f7c7d3972b0bab3a60929d9399d10ea97e16d606a6379f2901f4e9b744b4c943729afb3aec68d1bbb96c72ed7357bbd1417d"

RPROVIDES:${PN} += "ghc-devel-hslua-module-path-1.1.0-3XIGPd4cIDuFY6K1e1WFz9 \
ghc-hslua-module-path-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-devel-text-2.0.2 \
ghc-hslua-module-path"

inherit rpm
