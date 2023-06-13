SUMMARY = "Documentation for texlive-mmap"
DESCRIPTION = "This package includes the documentation for texlive-mmap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn15878"

RPM_NAME = "texlive-mmap-doc-2023.201.1.03svn15878-54.1.noarch.rpm"
RPM_HASH = "e90e184bf3e0c45ab2718af752080bf38f41d3bae339ee3a862c7211766336d0c0bc043e6aa814870f03335c67abb6761252b7e819b6cb9da94b1c182053eab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
