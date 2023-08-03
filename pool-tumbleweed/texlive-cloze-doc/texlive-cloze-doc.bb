SUMMARY = "Documentation for texlive-cloze"
DESCRIPTION = "This package includes the documentation for texlive-cloze"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn55763"

RPM_NAME = "texlive-cloze-doc-2023.209.1.6svn55763-54.1.noarch.rpm"
RPM_HASH = "336fde3e62a294b8c38161793d25a5cca4a2fcbefd06655ef3402f3d11647b0ade3b03e0ebf3f4a1782ff314f30c348a75ed7baf37ae6c72857037329504f1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cloze-doc"

RDEPENDS:${PN} += ""

inherit rpm
