SUMMARY = "Documentation for texlive-noto"
DESCRIPTION = "This package includes the documentation for texlive-noto"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64351"

RPM_NAME = "texlive-noto-doc-2023.209.svn64351-55.1.noarch.rpm"
RPM_HASH = "4b997fa1de603627d8ef471218a3e9ee446cfa5bbf08e21a72a872832c19fcee7eb57e46ea104e2397673cec2b93f56d12ca41a1e7263161b9dee90c840ea602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-doc"

RDEPENDS:${PN} += ""

inherit rpm
