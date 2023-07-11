SUMMARY = "Haskell tagsoup library development files"
DESCRIPTION = "This package provides the Haskell tagsoup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-devel-0.14.8-6.6.aarch64.rpm"
RPM_HASH = "ef2c1e1cad76cc2bc58f4c06b8ef91d83d6c390091cce862e13a5f59792e80497b5081b2e72b0084f035250e458368a30f1b0f7489a20494b5d666f72ea9e49b"

RPROVIDES:${PN} += "ghc-devel-tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn \
ghc-tagsoup-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-tagsoup"

inherit rpm
