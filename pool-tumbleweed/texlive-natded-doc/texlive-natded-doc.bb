SUMMARY = "Documentation for texlive-natded"
DESCRIPTION = "This package includes the documentation for texlive-natded"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn32693"

RPM_NAME = "texlive-natded-doc-2023.209.0.0.1svn32693-55.1.noarch.rpm"
RPM_HASH = "f3a68e279e3afdb2d5ee2c0eb01cb30f111f1ef72c9988368afa4514c0417fa44d40e61c7cb3531be1d110cd3b01ca4fce913f4412bd93fb838a5c07e6a7ec46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-natded-doc"

RDEPENDS:${PN} += ""

inherit rpm
