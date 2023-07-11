SUMMARY = "Documentation for texlive-repeatindex"
DESCRIPTION = "This package includes the documentation for texlive-repeatindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-doc-2023.201.0.0.01svn24305-53.2.noarch.rpm"
RPM_HASH = "02071f8ba93809c27908cb6cd58ab70e002a83432591ee04b64662d461e4e2fc74eebe7342bb44659ef4e59c6c9fb9629d9c40fc7538149882100e655cb350eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repeatindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
