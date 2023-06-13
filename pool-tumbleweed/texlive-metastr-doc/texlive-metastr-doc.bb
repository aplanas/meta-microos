SUMMARY = "Documentation for texlive-metastr"
DESCRIPTION = "This package includes the documentation for texlive-metastr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn56246"

RPM_NAME = "texlive-metastr-doc-2023.201.1.1.2svn56246-54.1.noarch.rpm"
RPM_HASH = "872ffae8a93ed8ec525076fe9d3ff3e9b09ebd0a980ee7fda7f9538c8b095c799a73b44c35cc48ffc1fe14fc9f15f5202042671d84a6c5a69a260b91ad34a652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metastr-doc"

RDEPENDS:${PN} += ""

inherit rpm
