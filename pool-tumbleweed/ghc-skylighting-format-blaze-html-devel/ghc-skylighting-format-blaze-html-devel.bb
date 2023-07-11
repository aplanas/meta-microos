SUMMARY = "Haskell skylighting-format-blaze-html library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-devel-0.1.1-2.4.aarch64.rpm"
RPM_HASH = "fbb931a8dd6f5b37079405b4c98faaa9f59542eee33bde1a519238dce706d917ec8e72799070fa40221efde5697fba33ea23ddde4f9681b810611817290968a1"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-blaze-html-0.1.1-F12UWgv4wxWHCG1WBLqTVs \
ghc-skylighting-format-blaze-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-blaze-html"

inherit rpm
