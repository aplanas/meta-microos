SUMMARY = "Documentation for texlive-psgo"
DESCRIPTION = "This package includes the documentation for texlive-psgo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.17svn15878"

RPM_NAME = "texlive-psgo-doc-2023.209.0.0.17svn15878-53.1.noarch.rpm"
RPM_HASH = "30760d5dabd23ea18fbac15d222e2ec1bdaecdd3617e47606af0b9bfda81cf78424e7c2a1d27db478c921b16d8b3bee3a938079e69dcecb7f3c8fb70a542c97d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psgo-doc"

RDEPENDS:${PN} += ""

inherit rpm
