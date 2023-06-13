SUMMARY = "Documentation for texlive-docshots"
DESCRIPTION = "This package includes the documentation for texlive-docshots"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn65141"

RPM_NAME = "texlive-docshots-doc-2023.201.0.0.4.0svn65141-52.1.noarch.rpm"
RPM_HASH = "f69284c2fadb47b04b65defa27f53e1c38d4b6159ecbbd2e7b881cc322a14c0985539318d8b6e8ebe815d69d8ccf4ddb543166c41ea201555d02480baa090f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docshots-doc"

RDEPENDS:${PN} += ""

inherit rpm
