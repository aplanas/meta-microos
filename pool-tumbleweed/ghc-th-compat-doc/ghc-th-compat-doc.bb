SUMMARY = "Haskell th-compat library documentation"
DESCRIPTION = "This package provides the Haskell th-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-th-compat-doc-0.1.4-2.2.noarch.rpm"
RPM_HASH = "59fd7a9aaa474b35f3b686ab9161821a7ed5f9af1dd2307efb9da54e1b71e663dec160b725a2bf47cc0eb0bb3871d98a968f05ce5aef24804a4931af1f75f777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-compat-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
