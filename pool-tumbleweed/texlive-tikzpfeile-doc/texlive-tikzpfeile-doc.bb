SUMMARY = "Documentation for texlive-tikzpfeile"
DESCRIPTION = "This package includes the documentation for texlive-tikzpfeile"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25777"

RPM_NAME = "texlive-tikzpfeile-doc-2023.201.1.0svn25777-52.1.noarch.rpm"
RPM_HASH = "bf10f6a4d7fabb16b6abb88345504ad3674a00d572984bf4311460eb73f71877e1dc558c4f7802e9df10ae0581974186639852f86efffdeab89ada404113a936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpfeile-doc"
RDEPENDS:${PN} += ""

inherit rpm
