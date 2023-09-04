SUMMARY = "Haskell fsnotify library documentation"
DESCRIPTION = "This package provides the Haskell fsnotify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.0"

RPM_NAME = "ghc-fsnotify-doc-0.4.1.0-2.10.noarch.rpm"
RPM_HASH = "34e996c1d7538f623ab3c2fc187b058e56ac06b0e91ccd8f2dc1b309e7c72e9b1f7d134c78460778bcc46dbe1d25596a8043cc1f05ee256d1e833fee83ff128b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fsnotify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
