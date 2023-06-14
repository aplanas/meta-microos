SUMMARY = "Documentation for texlive-pmhanguljamo"
DESCRIPTION = "This package includes the documentation for texlive-pmhanguljamo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn66361"

RPM_NAME = "texlive-pmhanguljamo-doc-2023.201.1.0.2svn66361-52.1.noarch.rpm"
RPM_HASH = "30312c2fd887f2e86ba7cc1d17b433677e63644615806eea0c5cc4f8df9d8117d229da2e7ee78616da685c4e444e44bde1cd7e1d6d5f2c18c1c8ef5d3e8d500d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pmhanguljamo-doc-ko \
texlive-pmhanguljamo-doc"

RDEPENDS:${PN} += ""

inherit rpm
