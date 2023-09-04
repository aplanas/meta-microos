SUMMARY = "Documentation for texlive-xetex-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-xetex-pstricks"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17055"

RPM_NAME = "texlive-xetex-pstricks-doc-2023.209.svn17055-53.2.noarch.rpm"
RPM_HASH = "5c5759015a1a8d1c6ead357d0a35419050afcabb220b9ac5622068c1c268cd393f39a7a8a9fc1419b97c36e944eaa3ec8621b056bfeb1ea87e196ee4ca8b3533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
