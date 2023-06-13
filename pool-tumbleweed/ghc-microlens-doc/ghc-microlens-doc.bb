SUMMARY = "Haskell microlens library documentation"
DESCRIPTION = "This package provides the Haskell microlens library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.13.1"

RPM_NAME = "ghc-microlens-doc-0.4.13.1-2.2.noarch.rpm"
RPM_HASH = "8a34e673b38f75b8d67d67f712478e2873d79653e70e3ae9931e891480a9ef0e138431d94d156db197aa3ce25367927367ea41331c840efb5e17e115c0c31ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
