SUMMARY = "Haskell xml library documentation"
DESCRIPTION = "This package provides the Haskell xml library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-doc-1.3.14-13.8.noarch.rpm"
RPM_HASH = "dda734ea66b276f9f1d74f9ff40b089a2d7aa75b26bede0b30e76588be4c2d23e21384fb9859adf82ab937439e276325832f43a9de7ee979a037caa015bd733d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
