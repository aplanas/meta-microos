SUMMARY = "Documentation for texlive-tikz-opm"
DESCRIPTION = "This package includes the documentation for texlive-tikz-opm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn32769"

RPM_NAME = "texlive-tikz-opm-doc-2023.201.0.0.1.1svn32769-52.1.noarch.rpm"
RPM_HASH = "6e9e60231c68ffed60ba4d0dcb128c2ebf209b3906bd0b6467f2c4d6bc70671d53ed201cf269590ecc344cfd78425ed1af75c4d7e0a36ae9359477bf95a072f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-opm-doc"

RDEPENDS:${PN} += ""

inherit rpm
