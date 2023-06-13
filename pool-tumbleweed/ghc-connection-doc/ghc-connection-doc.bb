SUMMARY = "Haskell connection library documentation"
DESCRIPTION = "This package provides the Haskell connection library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-doc-0.3.1-7.2.noarch.rpm"
RPM_HASH = "1e3319e4779981473cdaaab9a0fb4f05fdae60ffcd82d54215a2e5b24e25e7ec61eb56b935212f413846389584729eff27f83f8aee3fd0ca00c5fad627b42671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-connection-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
