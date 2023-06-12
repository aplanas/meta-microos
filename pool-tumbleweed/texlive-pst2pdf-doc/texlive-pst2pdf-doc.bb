SUMMARY = "Documentation for texlive-pst2pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.20svn56172"

RPM_NAME = "texlive-pst2pdf-doc-2023.201.0.0.20svn56172-53.1.noarch.rpm"
RPM_HASH = "cd7b3a86ff54d8a03a3119f027009fd9c1aa3cdd3d6cf2293921b4721a99ca7564e303dfa252072400c29609b902a8d9e52c22a558db87703c34d2e506601eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst2pdf-doc"
RDEPENDS:${PN} += ""

inherit rpm
