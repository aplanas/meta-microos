SUMMARY = "Documentation for texlive-letterswitharrows"
DESCRIPTION = "This package includes the documentation for texlive-letterswitharrows"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59993"

RPM_NAME = "texlive-letterswitharrows-doc-2023.209.svn59993-55.1.noarch.rpm"
RPM_HASH = "f5bd56fd99310d06da9c86ff266487a29fb4cc8befe3c09ba2668dc4080e5adc3dd4ece4f0c34252aa36f6bf8c8212da5c2b2a94ef099e0b8ae8fe6e20ca3c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-letterswitharrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
