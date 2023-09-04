SUMMARY = "Haskell hslua-core library development files"
DESCRIPTION = "This package provides the Haskell hslua-core library development files."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-devel-2.3.1-1.8.aarch64.rpm"
RPM_HASH = "b713b8474e9a7828cff5374ebb0bc6d6d1921599b4a14ad2183d829337df3edbc0be0083467161bc5792ed87565ed88a91bc678dd900aa142254262ced61fb79"

RPROVIDES:${PN} += "ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-hslua-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-core"

inherit rpm
