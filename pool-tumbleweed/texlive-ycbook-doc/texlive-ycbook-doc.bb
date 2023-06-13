SUMMARY = "Documentation for texlive-ycbook"
DESCRIPTION = "This package includes the documentation for texlive-ycbook"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46201"

RPM_NAME = "texlive-ycbook-doc-2023.201.svn46201-52.1.noarch.rpm"
RPM_HASH = "35f669940b91f26f9d7faba55522193110396dd7d2aa9c5e5bfdd683a6ae541365ec057613f1cfc1bec9f9f5faa797a6e9ea2b6dce7fb473499cd23651ae7a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ycbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
