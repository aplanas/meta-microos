SUMMARY = "Documentation for texlive-tikz-dimline"
DESCRIPTION = "This package includes the documentation for texlive-tikz-dimline"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35805"

RPM_NAME = "texlive-tikz-dimline-doc-2023.201.1.0svn35805-52.1.noarch.rpm"
RPM_HASH = "b8fdac2898b3cead1de61ab804c8a87c3d641098c93d346d9567408497472d64ef15ddec7368eea430458b2fe45c260f7faab5254e908397c0646648a2b49a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-dimline-doc"

RDEPENDS:${PN} += ""

inherit rpm
