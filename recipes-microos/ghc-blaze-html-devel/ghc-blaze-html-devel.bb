SUMMARY = "Haskell blaze-html library development files"
DESCRIPTION = "This package provides the Haskell blaze-html library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-devel-0.9.1.2-8.3.aarch64.rpm"
RPM_HASH = "c30aa20d438c1762d41d277b1eca6e5e693f1afc7863df6ff0653e5058c29ccd3fd95c989dac00fb394a073b040dec1efa1019131bdf1127bdda48ebffa2e22f"

RPROVIDES:${PN} += "ghc-blaze-html-devel ghc-blaze-html-devel(aarch-64) ghc-devel(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR)"
RDEPENDS:${PN} += "/bin/sh ghc-blaze-html ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) ghc-devel(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) ghc-devel(bytestring-0.11.4.0) ghc-devel(text-2.0.2)"

inherit rpm
