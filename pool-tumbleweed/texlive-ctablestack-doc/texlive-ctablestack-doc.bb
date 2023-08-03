SUMMARY = "Documentation for texlive-ctablestack"
DESCRIPTION = "This package includes the documentation for texlive-ctablestack"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38514"

RPM_NAME = "texlive-ctablestack-doc-2023.209.1.0svn38514-55.1.noarch.rpm"
RPM_HASH = "5e067069fc0e5995b3e369db75377c1b93a9448afe47d46595e10a5b8d5da5b35878081efc2cf761b2796b4dee2548868ccd9818a12e61268502131245423f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctablestack-doc"

RDEPENDS:${PN} += ""

inherit rpm
