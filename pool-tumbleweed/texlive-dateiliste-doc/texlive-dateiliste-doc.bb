SUMMARY = "Documentation for texlive-dateiliste"
DESCRIPTION = "This package includes the documentation for texlive-dateiliste"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn27974"

RPM_NAME = "texlive-dateiliste-doc-2023.209.0.0.6svn27974-55.1.noarch.rpm"
RPM_HASH = "82e4bbb5b7ddf3129f3ccfec4820dac5cf1338e4612d6106379aad959cbe2ad2f365e9988b865183e157a22a593ecfcd92199a750913097dbe87caf0a273400e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dateiliste-doc-de;en;eo \
texlive-dateiliste-doc"

RDEPENDS:${PN} += ""

inherit rpm
