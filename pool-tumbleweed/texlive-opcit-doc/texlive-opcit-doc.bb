SUMMARY = "Documentation for texlive-opcit"
DESCRIPTION = "This package includes the documentation for texlive-opcit"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-opcit-doc-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "01f391dc9b3212ab11829204677c8c4360ae435c8afeaceed655e50d96d6ed225e7701b05e3c4bb2fc74c4288e444e69afe2e634f566508bd5d26df2a72441af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opcit-doc"

RDEPENDS:${PN} += ""

inherit rpm
