SUMMARY = "Documentation for texlive-rmathbr"
DESCRIPTION = "This package includes the documentation for texlive-rmathbr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-doc-2023.209.1.1.1svn57173-54.1.noarch.rpm"
RPM_HASH = "51cf2f85c5fdbf748de357bdb9e19c8bbe1a1a1e95baf1dbf8c10249a71286a16feb4901b0c365663b48b993e56e9fc26f736fc7e10928217db671e9a4b22982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmathbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
