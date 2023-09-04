SUMMARY = "Haskell deriving-aeson library development files"
DESCRIPTION = "This package provides the Haskell deriving-aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-devel-0.2.9-3.1.aarch64.rpm"
RPM_HASH = "f391b6adf409db5420cd4e8314d8cfc5e17f9ff35816a6a95ef5f53913912decee09a89c228d05459b5452cb7a8461f04d27144fd1648a30562c9df51805822b"

RPROVIDES:${PN} += "ghc-deriving-aeson-devel \
ghc-devel-deriving-aeson-0.2.9-7GG7RbiGvWZJpJcDU5qu5W"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-deriving-aeson \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0"

inherit rpm
