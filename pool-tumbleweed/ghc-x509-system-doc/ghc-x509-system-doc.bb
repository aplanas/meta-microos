SUMMARY = "Haskell x509-system library documentation"
DESCRIPTION = "This package provides the Haskell x509-system library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-doc-1.6.7-2.6.noarch.rpm"
RPM_HASH = "a04b45eccea8135e7e19965418c4f1b099da28931346b8e38d5f95e22dd49a8cc857f070810015bd63d49bc67aea4f0231062c251821042f711dcf0317f10de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-system-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
