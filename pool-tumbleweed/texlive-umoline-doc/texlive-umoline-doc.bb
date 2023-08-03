SUMMARY = "Documentation for texlive-umoline"
DESCRIPTION = "This package includes the documentation for texlive-umoline"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19085"

RPM_NAME = "texlive-umoline-doc-2023.209.svn19085-54.1.noarch.rpm"
RPM_HASH = "0413cb6368e5f0a0a6ff3b977c8283493f7e4aa94f5bf975e291e3a2e15bc45a17c8247e1832b890e56f982f947dd8c4f496ecf4623fd538ae4526a7aa3b9ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umoline-doc"

RDEPENDS:${PN} += ""

inherit rpm
