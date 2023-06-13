SUMMARY = "Documentation for texlive-manfnt"
DESCRIPTION = "This package includes the documentation for texlive-manfnt"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54684"

RPM_NAME = "texlive-manfnt-doc-2023.201.svn54684-52.1.noarch.rpm"
RPM_HASH = "76814d2650013de124ca5c6b63a097ea9ef69c72a2f4779e740308024e88acd7db0ab27f7df3e2848492c2adddb5420d7d56b894eafbf2cc1914b08d2fd96a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manfnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
