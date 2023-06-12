SUMMARY = "Documentation for texlive-engpron"
DESCRIPTION = "This package includes the documentation for texlive-engpron"
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn16558"

RPM_NAME = "texlive-engpron-doc-2023.201.2svn16558-53.1.noarch.rpm"
RPM_HASH = "377d9f9dd5e0b47ec4cd7bb5e3c53af09fa44e126432cccf6b749497227332996ef63a1da697765d1b5a9102833e3fd983212959ac92bcbaff4cfcbbd3cb3a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-engpron-doc:fr;en) \
texlive-engpron-doc"
RDEPENDS:${PN} += ""

inherit rpm
