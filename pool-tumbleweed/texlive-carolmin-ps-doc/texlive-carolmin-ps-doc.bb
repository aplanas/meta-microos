SUMMARY = "Documentation for texlive-carolmin-ps"
DESCRIPTION = "This package includes the documentation for texlive-carolmin-ps"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-carolmin-ps-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "95fd0d17ecd2b0df78d8a6ef9d15a86c03667f82520260b8d29179c98792a6fcb34db23999c236418e4751763433976161fff6cde36985e31349bf3ae2e1b393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carolmin-ps-doc"

RDEPENDS:${PN} += ""

inherit rpm
