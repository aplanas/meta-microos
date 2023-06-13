SUMMARY = "Haskell auto-update library documentation"
DESCRIPTION = "This package provides the Haskell auto-update library documentation."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-doc-0.1.6-6.3.noarch.rpm"
RPM_HASH = "c33ca59cf5a6ba3a788e3d156a0ec21ec0a4a5fd2632d8b1f6aed913192fe50f05b75ea019b755c173a7626d046de43eefae68bea99bdcaa950a7b6f8c254acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-auto-update-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
