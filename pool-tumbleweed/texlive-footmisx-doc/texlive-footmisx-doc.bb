SUMMARY = "Documentation for texlive-footmisx"
DESCRIPTION = "This package includes the documentation for texlive-footmisx"
LICENSE = "LPPL-1.0"

PV = "2023.209.20161201svn42621"

RPM_NAME = "texlive-footmisx-doc-2023.209.20161201svn42621-53.1.noarch.rpm"
RPM_HASH = "4fddc8eb26f0ee113d2b413702b7efd0370e1875409ec3bfd50d777713ae6f055cfc9bfb78f56adbc8648be0b6722f8017664ee5049ae6ca211c4d487fd54538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footmisx-doc"

RDEPENDS:${PN} += ""

inherit rpm
