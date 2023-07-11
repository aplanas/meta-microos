SUMMARY = "Documentation for texlive-xytree"
DESCRIPTION = "This package includes the documentation for texlive-xytree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-xytree-doc-2023.201.1.5svn15878-52.2.noarch.rpm"
RPM_HASH = "44cb8d36098ec82bf4d204f0454f3e9a0b54d29235746016b9aba03cf331f5a503fa9e84a3afb0cdee3832871c7c91ee841353160a98b3b2ca58e222ddc77c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xytree-doc-en \
texlive-xytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
