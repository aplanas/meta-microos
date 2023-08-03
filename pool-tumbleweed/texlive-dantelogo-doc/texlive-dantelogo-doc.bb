SUMMARY = "Documentation for texlive-dantelogo"
DESCRIPTION = "This package includes the documentation for texlive-dantelogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-doc-2023.209.0.0.03svn38599-55.1.noarch.rpm"
RPM_HASH = "aa385ed03ebf170c8c9818201a1242ea7597b0b93e37ba27a8e3a5eb01b8b07b25978f443844ffcf41abda19950cdcbd02a47e8bdba98b5fa74bd4f9968f59c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dantelogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
