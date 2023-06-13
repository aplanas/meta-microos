SUMMARY = "Documentation for texlive-moderntimeline"
DESCRIPTION = "This package includes the documentation for texlive-moderntimeline"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn55518"

RPM_NAME = "texlive-moderntimeline-doc-2023.201.0.0.11svn55518-54.1.noarch.rpm"
RPM_HASH = "82937b14132b206a83184bdde45ff68f5d6101e60fa7ccc94fe559191c7c40dbcf69468ca42e3bc75619652277ca6f106d08ce1835b9a9e28e8ba47588ba7805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moderntimeline-doc"

RDEPENDS:${PN} += ""

inherit rpm
