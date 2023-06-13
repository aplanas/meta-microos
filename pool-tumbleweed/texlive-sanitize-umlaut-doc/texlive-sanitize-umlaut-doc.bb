SUMMARY = "Documentation for texlive-sanitize-umlaut"
DESCRIPTION = "This package includes the documentation for texlive-sanitize-umlaut"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn63770"

RPM_NAME = "texlive-sanitize-umlaut-doc-2023.201.1.2.1svn63770-53.1.noarch.rpm"
RPM_HASH = "b0010b6f9700ff040ae46856c3b730d262527b3b7f353dde248ec662014d49bf8b72cf97376c9875ca5a6a07e1a4bc9ef760c4737440414d1a8e75bc39f55aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanitize-umlaut-doc"

RDEPENDS:${PN} += ""

inherit rpm
