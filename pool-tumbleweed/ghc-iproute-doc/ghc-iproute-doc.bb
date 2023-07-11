SUMMARY = "Haskell iproute library documentation"
DESCRIPTION = "This package provides the Haskell iproute library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-doc-1.7.12-2.7.noarch.rpm"
RPM_HASH = "325cf4ed50a3eb794223dd030f49c207022d964ac1ee13d1a66d83f1be5ab6a50230a2c8d80985ba09dd7e3554234eb2079f2fdd17f3a7ed9d38f50d2606ed3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-iproute-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
