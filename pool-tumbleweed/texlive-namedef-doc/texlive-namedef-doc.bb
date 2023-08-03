SUMMARY = "Documentation for texlive-namedef"
DESCRIPTION = "This package includes the documentation for texlive-namedef"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55881"

RPM_NAME = "texlive-namedef-doc-2023.209.1.0svn55881-55.1.noarch.rpm"
RPM_HASH = "f4982401ade1f9a44227c176943283ab4b42b47e9223ae21ec1e21e1677b87fb623ee0c7a9df7ae47d93eea01763ee5b79dbca01c6de501839f4f39b82c04004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namedef-doc"

RDEPENDS:${PN} += ""

inherit rpm
