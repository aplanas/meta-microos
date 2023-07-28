SUMMARY = "Haskell skylighting-format-blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-prof-0.1.1-2.5.aarch64.rpm"
RPM_HASH = "cc741e02a42572ab6a25a8dd3efcc04943f81874292dcc0eb81b859696cf7c5af7a44bfcdf97cfb0e648982b948b502c61d9743d16b6de644ef06c6791039e4d"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-blaze-html-0.1.1-2S5li2Ic3P8IXVFqKrjQNX \
ghc-skylighting-format-blaze-html-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-blaze-html-devel"

inherit rpm
