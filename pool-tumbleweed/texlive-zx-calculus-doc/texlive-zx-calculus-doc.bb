SUMMARY = "Documentation for texlive-zx-calculus"
DESCRIPTION = "This package includes the documentation for texlive-zx-calculus"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60838"

RPM_NAME = "texlive-zx-calculus-doc-2023.201.svn60838-52.1.noarch.rpm"
RPM_HASH = "a57515940479a78e21de8e8726427935ae0783f5a41fec6c82d66f3ef4006f551b6848d83e7d6e07d442c342203a21c8eef51abaec50e45481b45b202f31bf8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zx-calculus-doc"

RDEPENDS:${PN} += ""

inherit rpm
