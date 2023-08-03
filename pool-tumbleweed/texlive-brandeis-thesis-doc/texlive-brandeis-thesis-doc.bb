SUMMARY = "Documentation for texlive-brandeis-thesis"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn59832"

RPM_NAME = "texlive-brandeis-thesis-doc-2023.209.3.2svn59832-53.1.noarch.rpm"
RPM_HASH = "8fcf4ed0d9d74c9a537f40d4e4977dd99e57d0be9512c23716da51f0641822a4c37ca5c9e209c6387886cbe7a8318b6facce10357df0e6758b94f70140d9e525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
