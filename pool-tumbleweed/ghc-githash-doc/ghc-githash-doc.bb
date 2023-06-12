SUMMARY = "Haskell githash library documentation"
DESCRIPTION = "This package provides the Haskell githash library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.3"

RPM_NAME = "ghc-githash-doc-0.1.6.3-2.3.noarch.rpm"
RPM_HASH = "5e02fb9a77bdf170422adbe6284ba1206fd98d2e4e2ce46619891752811e5a6b177a1ad1bfe0ca0b8c6040a9d4a285d47c806645ad9d3b2f4bcc8241a20b35a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-githash-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
