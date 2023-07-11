SUMMARY = "Documentation for texlive-gothic"
DESCRIPTION = "This package includes the documentation for texlive-gothic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49869"

RPM_NAME = "texlive-gothic-doc-2023.201.svn49869-53.2.noarch.rpm"
RPM_HASH = "7548bef579bf39aa38aaa28657547514ae6f6e57d878d49c6785cfbbb9830cdca372cce2b441a585f035ddcc14d9116a6f9fb119f9a20a2a89f30417e6660839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gothic-doc"

RDEPENDS:${PN} += ""

inherit rpm
