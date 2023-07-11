SUMMARY = "Documentation for texlive-emp"
DESCRIPTION = "This package includes the documentation for texlive-emp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn23483"

RPM_NAME = "texlive-emp-doc-2023.201.svn23483-53.2.noarch.rpm"
RPM_HASH = "833926cb160ef4719d4eb8b1bf17ef8b7ad24827c1c66174bbbeb2a0e6fdea2a6c92bc2335ad09371c4b9356f8d3dfc4f58f2f4b2f7d522125dcf96c49e30397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emp-doc"

RDEPENDS:${PN} += ""

inherit rpm
