SUMMARY = "Documentation for texlive-pmgraph"
DESCRIPTION = "This package includes the documentation for texlive-pmgraph"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pmgraph-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "b242dc14198a24f3bbbfa1b81fc3f7715fd56f1fae9bd129a3cf21a0092432894c8c451eb185de8b6a08d6b6907dfe29c232161c4ce97bb3eafb9060eb3fdad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pmgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
