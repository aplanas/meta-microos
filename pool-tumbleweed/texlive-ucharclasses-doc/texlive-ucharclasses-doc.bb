SUMMARY = "Documentation for texlive-ucharclasses"
DESCRIPTION = "This package includes the documentation for texlive-ucharclasses"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.6svn64782"

RPM_NAME = "texlive-ucharclasses-doc-2023.201.2.6svn64782-53.1.noarch.rpm"
RPM_HASH = "ca4676a2e650251bbd09289029368e719eeb50d0633ec2757392afaebb09b7ca1c767d3ace1fdeeb0a669f1bf754b028a6b79df6b5a19d2c1a1ac188965af16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucharclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
