SUMMARY = "Haskell some library documentation"
DESCRIPTION = "This package provides the Haskell some library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-doc-1.0.5-1.6.noarch.rpm"
RPM_HASH = "852f50e9f14028fffce27becd0696abd316d41e8712566a029a1cd9d99242657176fe7bafec803a87438ab02677bae321f1d8076f141619ba019b16bff3374f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-some-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
