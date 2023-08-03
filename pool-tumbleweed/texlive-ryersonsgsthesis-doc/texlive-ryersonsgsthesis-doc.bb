SUMMARY = "Documentation for texlive-ryersonsgsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ryersonsgsthesis"
LICENSE = "Apache-1.0"

PV = "2023.209.1.0.3svn50119"

RPM_NAME = "texlive-ryersonsgsthesis-doc-2023.209.1.0.3svn50119-54.1.noarch.rpm"
RPM_HASH = "d0da3e0960f8434b5e5a00369269c55a694e58b4c44011623dbf0d61ecedef04eef301b4aac98d9563208a751628ad01fdab608304db19ca4ce35798e742bfc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ryersonsgsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
