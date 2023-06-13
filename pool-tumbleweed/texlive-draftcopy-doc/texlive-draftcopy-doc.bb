SUMMARY = "Documentation for texlive-draftcopy"
DESCRIPTION = "This package includes the documentation for texlive-draftcopy"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.16svn15878"

RPM_NAME = "texlive-draftcopy-doc-2023.201.2.16svn15878-52.1.noarch.rpm"
RPM_HASH = "3d77d0807e1213be8c0b50b9f96d0b523dc625308c737af43cc6d6bf049a1edd5c7f6fd80336ea3f0780c1466f971dc56cabfa684bf2d4026dff6edf636e6e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftcopy-doc"

RDEPENDS:${PN} += ""

inherit rpm
