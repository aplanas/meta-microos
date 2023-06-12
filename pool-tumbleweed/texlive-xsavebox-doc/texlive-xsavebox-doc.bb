SUMMARY = "Documentation for texlive-xsavebox"
DESCRIPTION = "This package includes the documentation for texlive-xsavebox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn64049"

RPM_NAME = "texlive-xsavebox-doc-2023.201.0.0.18svn64049-52.1.noarch.rpm"
RPM_HASH = "289a39030b0e729f0cd76e503698cb730d762b232967808ea32432812d4f22a56a5699709b0de5b4a777904106934437de7a24c05b9e4af5e61e15c02a8934e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsavebox-doc"
RDEPENDS:${PN} += ""

inherit rpm
