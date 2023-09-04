SUMMARY = "Documentation for texlive-hobby"
DESCRIPTION = "This package includes the documentation for texlive-hobby"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn44474"

RPM_NAME = "texlive-hobby-doc-2023.209.1.8svn44474-54.2.noarch.rpm"
RPM_HASH = "4a101559cbfbbce82ebe7c8d89079a56bff8aff73f59ca6b19000d41d00accf94886082557895a9d26ca781c1af9258393d0127237f6957375c9b8b36681a1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobby-doc"

RDEPENDS:${PN} += ""

inherit rpm
