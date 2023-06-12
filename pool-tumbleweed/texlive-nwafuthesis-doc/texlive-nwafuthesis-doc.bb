SUMMARY = "Documentation for texlive-nwafuthesis"
DESCRIPTION = "This package includes the documentation for texlive-nwafuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn63438"

RPM_NAME = "texlive-nwafuthesis-doc-2023.201.1.15svn63438-54.1.noarch.rpm"
RPM_HASH = "070128b8023479ac7829e5554397acd142c64ce2c03b481fb788400cfb247eb9ec720471750cf7abe7a1c0b52b0c3f4df1906b242bf70fb20e898565b9a48fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-nwafuthesis-doc:zh) \
texlive-nwafuthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
