SUMMARY = "Documentation for texlive-unicode-alphabets"
DESCRIPTION = "This package includes the documentation for texlive-unicode-alphabets"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66225"

RPM_NAME = "texlive-unicode-alphabets-doc-2023.209.svn66225-54.1.noarch.rpm"
RPM_HASH = "5c281ee644dd1fcbbf3b501fe02df1a43c67e089bdb7f92e288df49c024871aa273f9f69c8e5f13bbcea625f5125cf9c61fb9e1b8277958e1b7f57b23843154b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-alphabets-doc"

RDEPENDS:${PN} += ""

inherit rpm
