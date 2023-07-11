SUMMARY = "Documentation for texlive-hep-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-hep-bibliography"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-doc-2023.201.1.1svn64888-53.2.noarch.rpm"
RPM_HASH = "799275ebd5dae3a33dd22f88f856c75a07a09344af6cef22e71fbe6662df2724824563b527b08c43bc853544d4a054ef79605030f2ae82595e11049580de5c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
