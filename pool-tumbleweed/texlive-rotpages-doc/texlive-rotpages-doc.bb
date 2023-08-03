SUMMARY = "Documentation for texlive-rotpages"
DESCRIPTION = "This package includes the documentation for texlive-rotpages"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn18740"

RPM_NAME = "texlive-rotpages-doc-2023.209.3.0svn18740-54.1.noarch.rpm"
RPM_HASH = "3448a4bbb73c9427f0fa7feb2341d8bf9d01d3cf6e0e8c79d86aaaa74eefff5b81a71639afde1605b81c11574fef86e4b596a4162da4364a059dc60a2db5d124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rotpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
