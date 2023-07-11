SUMMARY = "Haskell network-bsd library documentation"
DESCRIPTION = "This package provides the Haskell network-bsd library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-doc-2.8.1.0-7.3.noarch.rpm"
RPM_HASH = "1e3e12796acb78cba68187ae45ae9c3785a873eef06c2400e14a2cd981e1370913a4f4d68e637a5d1c86bdf05f50aaec1b8177d4f1f873b859c9f1e02b2083b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-bsd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
