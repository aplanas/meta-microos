SUMMARY = "Documentation for texlive-quran-ur"
DESCRIPTION = "This package includes the documentation for texlive-quran-ur"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-doc-2023.209.0.0.21svn57597-54.1.noarch.rpm"
RPM_HASH = "c41a30d946aafa4c5d7675ecb68522e97c855045cf26b990c7e9a87bd984b24ea2d13e816b11dc616c08c5f621866295d14f3d872c03ca90a6e097410561f967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-ur-doc"

RDEPENDS:${PN} += ""

inherit rpm
