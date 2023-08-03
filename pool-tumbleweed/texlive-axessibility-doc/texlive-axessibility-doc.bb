SUMMARY = "Documentation for texlive-axessibility"
DESCRIPTION = "This package includes the documentation for texlive-axessibility"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn57105"

RPM_NAME = "texlive-axessibility-doc-2023.209.3.0svn57105-54.1.noarch.rpm"
RPM_HASH = "b12ce1b0f803b389876a2bc1f4ae47a59f2428480f44757f9fd6bdbf496c12fc43d42d1d1a60c1bac1d476c72e3ead2f249f6bd33395ae75a1e7f9f8fa39be06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-axessibility-doc"

RDEPENDS:${PN} += ""

inherit rpm
