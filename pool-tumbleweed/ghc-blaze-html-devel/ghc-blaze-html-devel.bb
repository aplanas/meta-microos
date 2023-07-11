SUMMARY = "Haskell blaze-html library development files"
DESCRIPTION = "This package provides the Haskell blaze-html library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-devel-0.9.1.2-8.6.aarch64.rpm"
RPM_HASH = "385b8af06c4143f00f8d7c893fc4dde00bdde251c3a0ffd8e8273da67aa1df7e9f8745c9e10c2b0c4fc584e71102ce1978bbba2c777831977c42b857d9f01c59"

RPROVIDES:${PN} += "ghc-blaze-html-devel \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-html \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2"

inherit rpm
