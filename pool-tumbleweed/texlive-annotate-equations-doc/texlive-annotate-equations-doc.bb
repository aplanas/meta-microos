SUMMARY = "Documentation for texlive-annotate-equations"
DESCRIPTION = "This package includes the documentation for texlive-annotate-equations"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn65851"

RPM_NAME = "texlive-annotate-equations-doc-2023.209.0.0.2.0svn65851-55.1.noarch.rpm"
RPM_HASH = "538ac57439cb3c74f54c898cbfcea9b3053c80fb3f2c3e566a5b8b1c6484c67f11dd327723a6945ea4cd6ed54efdbdd6a447f53f352f5417732509f4ab863013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-annotate-equations-doc"

RDEPENDS:${PN} += ""

inherit rpm
