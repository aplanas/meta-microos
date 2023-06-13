SUMMARY = "Documentation for texlive-coolstr"
DESCRIPTION = "This package includes the documentation for texlive-coolstr"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.204.2.2svn15878"

RPM_NAME = "texlive-coolstr-doc-2023.204.2.2svn15878-54.1.noarch.rpm"
RPM_HASH = "fc9dace8cafd74dcefa6c6210d771393bde71402692759ed61019ebdc6a480d2fb8b47481119b7e9491ddacafc0c634a8bc9e362f25b40a319bfe2c88ba4a56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolstr-doc"

RDEPENDS:${PN} += ""

inherit rpm
