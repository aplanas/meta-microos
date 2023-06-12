SUMMARY = "Documentation for texlive-testhyphens"
DESCRIPTION = "This package includes the documentation for texlive-testhyphens"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn38928"

RPM_NAME = "texlive-testhyphens-doc-2023.201.0.0.7svn38928-54.1.noarch.rpm"
RPM_HASH = "fbce68990d99c19676820133afba5d1682f484446ee0f4539900957dcc6e1a1d61a69d8ebe46e2640791d4d746c30b4d493164995396fdcf7bc30f24df300b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-testhyphens-doc"
RDEPENDS:${PN} += ""

inherit rpm
