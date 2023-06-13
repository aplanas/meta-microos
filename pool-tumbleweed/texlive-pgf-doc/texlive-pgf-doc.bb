SUMMARY = "Documentation for texlive-pgf"
DESCRIPTION = "This package includes the documentation for texlive-pgf"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.10svn65553"

RPM_NAME = "texlive-pgf-doc-2023.201.3.1.10svn65553-51.1.noarch.rpm"
RPM_HASH = "4a0fcd910c08b7c532914b63081aa6f144659c012e5ba18caa81c1d03dc78f8a19cf39a8d159cce6a6d57816900841364de7ea0ce552a99df5d38e320bf85ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-doc"

RDEPENDS:${PN} += ""

inherit rpm
