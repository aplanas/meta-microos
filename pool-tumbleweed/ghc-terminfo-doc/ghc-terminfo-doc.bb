SUMMARY = "Haskell terminfo library documentation"
DESCRIPTION = "This package provides the Haskell terminfo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-doc-0.4.1.5-3.1.noarch.rpm"
RPM_HASH = "01f923360024b73cbd44e29c932eacd71f394de3255ef87e029340be961c0049ff9a9bac46c514c73245374547eacdfbb480e85a581290b265c5d23a476071aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminfo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
