SUMMARY = "Documentation for texlive-pdfslide"
DESCRIPTION = "This package includes the documentation for texlive-pdfslide"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pdfslide-doc-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "35ff9d007de4da8e7a1bc426fe5cfe4f4b78ba7a18a42ef4dd0cf46cce21a9fbf547c3ed3cf191150de22a2b98f5ed3f620def892830f60cb784c4856b91f9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfslide-doc"
RDEPENDS:${PN} += ""

inherit rpm
