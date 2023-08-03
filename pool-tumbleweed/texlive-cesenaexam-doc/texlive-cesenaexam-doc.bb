SUMMARY = "Documentation for texlive-cesenaexam"
DESCRIPTION = "This package includes the documentation for texlive-cesenaexam"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn44960"

RPM_NAME = "texlive-cesenaexam-doc-2023.209.0.0.2svn44960-53.1.noarch.rpm"
RPM_HASH = "e622f9fbe66503fed2de35452e3efd6c2d594708356d96436e356585eecb7b6ee6525cd7a42f1a49b771b5b8e5b100899efedaea28dc30c1a5ae44fda5aa1cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cesenaexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
