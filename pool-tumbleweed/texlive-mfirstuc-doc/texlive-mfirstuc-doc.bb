SUMMARY = "Documentation for texlive-mfirstuc"
DESCRIPTION = "This package includes the documentation for texlive-mfirstuc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.08svn64743"

RPM_NAME = "texlive-mfirstuc-doc-2023.201.2.08svn64743-54.1.noarch.rpm"
RPM_HASH = "c1462d2fe38a331d7b01f86c1827b3b563e4fa027d1d7ecde96127b1e11a6e3e3f957c8505d96eef8a997dee9d3f38db470298144a151a1356ba587dd1bfa9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfirstuc-doc"

RDEPENDS:${PN} += ""

inherit rpm
