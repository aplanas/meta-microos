SUMMARY = "Documentation for texlive-ordinalpt"
DESCRIPTION = "This package includes the documentation for texlive-ordinalpt"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-ordinalpt-doc-2023.209.2.1svn15878-55.1.noarch.rpm"
RPM_HASH = "a9c66cb1d8d993c58d47d3b54d58c50699423b37397a20982c7e9f9e887cb134533b5a99097d6ce42d61c5db4bd04c1bc585db1dbc32908d2f666ac8611be77d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ordinalpt-doc"

RDEPENDS:${PN} += ""

inherit rpm
