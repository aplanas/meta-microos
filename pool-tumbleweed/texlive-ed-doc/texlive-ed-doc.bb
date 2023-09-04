SUMMARY = "Documentation for texlive-ed"
DESCRIPTION = "This package includes the documentation for texlive-ed"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn25231"

RPM_NAME = "texlive-ed-doc-2023.209.1.8svn25231-54.2.noarch.rpm"
RPM_HASH = "3c9bdcc9e9a85f04b09f0375b4ec7460b85481eb322eb7e280b9810de133f8fb7b81ddf1efa57e67dfc6024d1e1c138ae6329c56f853b247823b597b3db4897e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ed-doc"

RDEPENDS:${PN} += ""

inherit rpm
