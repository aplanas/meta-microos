SUMMARY = "Documentation for texlive-ltxguidex"
DESCRIPTION = "This package includes the documentation for texlive-ltxguidex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn50992"

RPM_NAME = "texlive-ltxguidex-doc-2023.201.0.0.2.0svn50992-52.1.noarch.rpm"
RPM_HASH = "abdd6e0a30ecae2a0fd5eaab76232de17ef3e9e046e13506d738d9d946971e7ae4438f2a67f77f5eb0c59dba1bf183b040e704e4846d7b36045b463c6e29dcf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxguidex-doc"

RDEPENDS:${PN} += ""

inherit rpm
