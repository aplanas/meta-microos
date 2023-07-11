SUMMARY = "Documentation for texlive-xcharter"
DESCRIPTION = "This package includes the documentation for texlive-xcharter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.24svn63057"

RPM_NAME = "texlive-xcharter-doc-2023.201.1.24svn63057-52.2.noarch.rpm"
RPM_HASH = "22414ec9ea05d56e25da6a5871aac38cbce460475c4eb8e4b0394affbb0ea896c8971910a7db4ef58d40df8a7e78897e13eb5f8a587369eaec80687c7aaf7fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
