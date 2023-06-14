SUMMARY = "Documentation for texlive-parsa"
DESCRIPTION = "This package includes the documentation for texlive-parsa"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn54840"

RPM_NAME = "texlive-parsa-doc-2023.201.1.3svn54840-51.1.noarch.rpm"
RPM_HASH = "45af77e12b380ce79cad6256ca11ffc78f370e9db4955832cdb2d3821f5dcc8185e5ddd5041348c021484f9ba73fde047171bde3d2e89d9a808d12a017148756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-parsa-doc-fa \
texlive-parsa-doc"

RDEPENDS:${PN} += ""

inherit rpm
