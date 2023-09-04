SUMMARY = "Haskell brick library documentation"
DESCRIPTION = "This package provides the Haskell brick library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-doc-1.6-2.11.noarch.rpm"
RPM_HASH = "3e5617f4f6b834628b983767e840f1aecbd60f43f1959f1a6f4b4a3a2a6fc9bc8c41bdf1c6d72d8d92c49f57231ec410e3ba40df22692d771d0729bd95120d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-brick-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
