SUMMARY = "Documentation for texlive-underlin"
DESCRIPTION = "This package includes the documentation for texlive-underlin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-underlin-doc-2023.209.1.01svn15878-54.1.noarch.rpm"
RPM_HASH = "f9dab48a75d90a588ec9b554a257bb12feb3c6a37d3c3994af12e0c6dcb9057905336531b51c03e6831ddd52ad15fc91a5a9e2e5c049acca0422fbb98f118d96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
