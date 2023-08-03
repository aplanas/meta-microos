SUMMARY = "Documentation for texlive-utf8mex"
DESCRIPTION = "This package includes the documentation for texlive-utf8mex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-utf8mex-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "5ad42f95295d9ee1be3f8e6e429bdc2dc3eda509fb83149a921b4eadc74d4e6a415e3da204f630f3dd431869156156d826ab8e5e1fbcd88ed0f1c54ea8a1a80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utf8mex-doc"

RDEPENDS:${PN} += ""

inherit rpm
