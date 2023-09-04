SUMMARY = "Haskell hslua-classes library development files"
DESCRIPTION = "This package provides the Haskell hslua-classes library development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-devel-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "0f722c3e891bcbdb65e46a5673c3d4c2a0e7fb14cb192661db9e5ea918405f5fbe87e54309df2544832ecd9d44aef6235c335432d4b38045777e34112967c3d6"

RPROVIDES:${PN} += "ghc-devel-hslua-classes-2.3.0-B1L4OZUPrf8GQ47NXlejyp \
ghc-hslua-classes-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-text-2.0.2 \
ghc-hslua-classes"

inherit rpm
