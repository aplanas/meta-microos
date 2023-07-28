SUMMARY = "Haskell skylighting-format-blaze-html library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-devel-0.1.1-2.5.aarch64.rpm"
RPM_HASH = "5b50fac0ae972d37a8ec84230b2474ee7fa2d90ff6bed7babdb1f5d54893584a2dcd1901b8d07a5726ef4812088db2aecc26661b2b6c9bdc2e2f8bfb502176ae"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-blaze-html-0.1.1-2S5li2Ic3P8IXVFqKrjQNX \
ghc-skylighting-format-blaze-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-blaze-html"

inherit rpm
