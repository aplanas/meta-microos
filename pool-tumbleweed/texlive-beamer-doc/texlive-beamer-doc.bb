SUMMARY = "Documentation for texlive-beamer"
DESCRIPTION = "This package includes the documentation for texlive-beamer"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.69svn65984"

RPM_NAME = "texlive-beamer-doc-2023.201.3.69svn65984-53.1.noarch.rpm"
RPM_HASH = "04d460914db67bdd3b3d2189a727ea6b321db75c38e77a77f791f9700dbca65e33fb5951ca1171ca876d42b374badcf219e441647bad5d2f3bd4e6b4ac1401e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
