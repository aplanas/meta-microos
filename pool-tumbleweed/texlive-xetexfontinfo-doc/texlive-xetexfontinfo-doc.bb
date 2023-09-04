SUMMARY = "Documentation for texlive-xetexfontinfo"
DESCRIPTION = "This package includes the documentation for texlive-xetexfontinfo"
LICENSE = "Apache-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-xetexfontinfo-doc-2023.209.svn15878-53.2.noarch.rpm"
RPM_HASH = "f5c4cf0a5845d0e4c721e159a69588e87102bba47b7a9d5241bc5a85d6f0489b8661c43a3e0fddb8270ca7842940a7a40ec8e1741cb5da17fde916831cfbe14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexfontinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
