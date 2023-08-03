SUMMARY = "Documentation for texlive-titlesec"
DESCRIPTION = "This package includes the documentation for texlive-titlesec"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn59845"

RPM_NAME = "texlive-titlesec-doc-2023.209.2.14svn59845-53.1.noarch.rpm"
RPM_HASH = "786472f1fb92a4a64ed247cc14b74c66c177dbe65bbc0f1b8eb26f4c410d58d17c8f1c4ecff4b28a21f9d3ce130c86ec37a16af482d7355d87729e565948562f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlesec-doc"

RDEPENDS:${PN} += ""

inherit rpm
