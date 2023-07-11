SUMMARY = "Documentation for texlive-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-pstricks"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.18svn65346"

RPM_NAME = "texlive-pstricks-doc-2023.201.3.18svn65346-53.2.noarch.rpm"
RPM_HASH = "f2d20dda64758d9599b7e16e086d5617665db7af354801d4ded3ef85f2901b9fe473fdf86be11b313338da1ba43ec34cf9a4ec08e30d6fe7ca6bbdf00f7571f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
