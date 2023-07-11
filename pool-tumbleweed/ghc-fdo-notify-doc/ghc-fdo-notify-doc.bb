SUMMARY = "Haskell fdo-notify library documentation"
DESCRIPTION = "This package provides the Haskell fdo-notify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-doc-0.3.1-4.4.noarch.rpm"
RPM_HASH = "26c3f5e7483edc48d24fccef3ca286df5295328007393df9fa80e90baac6edaea230350209e96d89bc77e4b54de0ef5bf7e0ea250a082c46471903a33192e673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fdo-notify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
