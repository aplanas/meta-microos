SUMMARY = "Documentation for texlive-arabtex"
DESCRIPTION = "This package includes the documentation for texlive-arabtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.17svn64260"

RPM_NAME = "texlive-arabtex-doc-2023.209.3.17svn64260-55.1.noarch.rpm"
RPM_HASH = "6828178e6c81379988c7bcb20111cb4d56a684763b45565fc75fcc06a74de05043033e2da0a682ccde8657c5dac5b07e8f06e7f49c7fc8e622ff514f0f597ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
