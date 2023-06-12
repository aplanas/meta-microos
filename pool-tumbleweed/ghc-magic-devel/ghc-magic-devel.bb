SUMMARY = "Haskell magic library development files"
DESCRIPTION = "This package provides the Haskell magic library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-devel-1.1-4.3.aarch64.rpm"
RPM_HASH = "9541e0daa261c3225d05f87519e36f7859a2d083e06197580a41f99119b69670f8ace2f834adfffa70706781a7bbf0de72344afe537e00085b3bcc8a0295b747"

RPROVIDES:${PN} += "ghc-devel(magic-1.1-FZjtT3pxmlr6oRrs4QNuLe) \
ghc-magic-devel \
ghc-magic-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
file-devel \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-magic"

inherit rpm
