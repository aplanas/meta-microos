SUMMARY = "Haskell free library documentation"
DESCRIPTION = "This package provides the Haskell free library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-doc-5.1.10-2.6.noarch.rpm"
RPM_HASH = "4e6aec9d4a6acffa946eab418a9fabc0b905165ea308e03007c5acffa6d81163698dcc3ddafbbcd6a7e3874247b2670090a922ee0e98b721098de506e153c820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-free-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
