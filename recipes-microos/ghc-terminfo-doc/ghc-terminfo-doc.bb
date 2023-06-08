SUMMARY = "Haskell terminfo library documentation"
DESCRIPTION = "This package provides the Haskell terminfo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-doc-0.4.1.5-1.1.noarch.rpm"
RPM_HASH = "d16d77382e89ac2113495a138ed1ec1df278d7eda217a08933bc8d091a99460d89db4e3b55cf1a998342f9aa299873f1502a75c29bdba731a3d5ee6b5ff7e47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminfo-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
