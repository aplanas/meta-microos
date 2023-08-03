SUMMARY = "Documentation for texlive-gs1"
DESCRIPTION = "This package includes the documentation for texlive-gs1"
LICENSE = "LPPL-1.0"

PV = "2023.209.23svn59620"

RPM_NAME = "texlive-gs1-doc-2023.209.23svn59620-54.1.noarch.rpm"
RPM_HASH = "a9fc51d44aaefe30c91cb6cec3dd7bc7a8fcb3e0a2d06ab515db30219a567fb6a942e96d378c23124bf4169bbaa7240bae5a1ae038320418c1e7dbc1b47d62c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gs1-doc"

RDEPENDS:${PN} += ""

inherit rpm
