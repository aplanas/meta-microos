SUMMARY = "Documentation for texlive-knittingpattern"
DESCRIPTION = "This package includes the documentation for texlive-knittingpattern"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17205"

RPM_NAME = "texlive-knittingpattern-doc-2023.209.svn17205-56.1.noarch.rpm"
RPM_HASH = "7211bf0deb2272c2337023b184081e0ad8dcc9e4720b21a48424cfddecb26f5ead307959569a42dd1f2092bdb90f3fc02d8976f95f6358b08491fe06e50b9bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knittingpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
