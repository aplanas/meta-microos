SUMMARY = "Haskell time-manager library documentation"
DESCRIPTION = "This package provides the Haskell time-manager library documentation."
LICENSE = "MIT"

PV = "0.0.0"

RPM_NAME = "ghc-time-manager-doc-0.0.0-5.2.noarch.rpm"
RPM_HASH = "d9c0afc177bc932c8dbb694a3fefbf361d3714962b742abae4d5b5418fe19fdbbb1f6aa0506d2118b00167c3145af52946f6babea5b54fb8c961199e02445920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
