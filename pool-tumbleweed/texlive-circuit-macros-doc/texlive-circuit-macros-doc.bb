SUMMARY = "Documentation for texlive-circuit-macros"
DESCRIPTION = "This package includes the documentation for texlive-circuit-macros"
LICENSE = "LPPL-1.0"

PV = "2023.201.10.2svn66549"

RPM_NAME = "texlive-circuit-macros-doc-2023.201.10.2svn66549-53.1.noarch.rpm"
RPM_HASH = "9b3e3c23fe13e193058fd1798d823c9771eb438b4d7c9a3abba25ba82e5da2f66e5abe6aeb54dee0999b5da6ed28a559c8c8c4bf72a6ed31abce0e0a55a7a78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circuit-macros-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
