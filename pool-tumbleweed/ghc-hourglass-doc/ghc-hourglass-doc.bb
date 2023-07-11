SUMMARY = "Haskell hourglass library documentation"
DESCRIPTION = "This package provides the Haskell hourglass library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-doc-0.2.12-7.6.noarch.rpm"
RPM_HASH = "1740f1c0935abe37a1078d0493126a3f7ca9bcb643822ff5aac0f25b80b7994011540b736619de33f1b00f45b4f77e1d798f151d897cf1a7b2832eafc0bc79a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hourglass-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
