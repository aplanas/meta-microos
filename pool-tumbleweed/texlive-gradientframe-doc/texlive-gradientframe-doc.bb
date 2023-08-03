SUMMARY = "Documentation for texlive-gradientframe"
DESCRIPTION = "This package includes the documentation for texlive-gradientframe"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-doc-2023.209.0.0.2svn21387-54.1.noarch.rpm"
RPM_HASH = "fd7958491c1d6f8619934bd3ce482bf4e8ba2cb20430ca851550f90363e608fb0d66d3b7b96355b02d731c75be8f96c5fef299628b030f4b3a9945370446da12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradientframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
