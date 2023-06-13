SUMMARY = "Documentation for texlive-hep-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-hep-bibliography"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-doc-2023.201.1.1svn64888-53.1.noarch.rpm"
RPM_HASH = "68ba247ff65f76a48b353df5af5c0d8b3db53406ab9a6fc37e2d07e4042f29278cd83d15b70056521422526275b9663766ea3aabb37644509770fcd1ada1d065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
