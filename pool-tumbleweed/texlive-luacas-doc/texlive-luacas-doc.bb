SUMMARY = "Documentation for texlive-luacas"
DESCRIPTION = "This package includes the documentation for texlive-luacas"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.1svn65042"

RPM_NAME = "texlive-luacas-doc-2023.208.1.0.1svn65042-53.1.noarch.rpm"
RPM_HASH = "3305ab24ed9261906c588787778167f2b5e11fb459eb6c2e5c0a7c0a4109330125d7b85112fa793dc0f6b5c3e8ef3ffb4b3f5449f30b5d1921c0f1867ff0d37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacas-doc"

RDEPENDS:${PN} += ""

inherit rpm
