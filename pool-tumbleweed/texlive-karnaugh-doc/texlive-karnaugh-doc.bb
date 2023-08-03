SUMMARY = "Documentation for texlive-karnaugh"
DESCRIPTION = "This package includes the documentation for texlive-karnaugh"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21338"

RPM_NAME = "texlive-karnaugh-doc-2023.209.svn21338-56.1.noarch.rpm"
RPM_HASH = "d055fac66be1b00900c7d59b38136956ae459c81a5b27ae5c0165cb6b670df182848835a08136836824e5a58bc54e10dbef7d6f544e2f96b5cff385d94a99f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaugh-doc"

RDEPENDS:${PN} += ""

inherit rpm
