SUMMARY = "Documentation for texlive-hacm"
DESCRIPTION = "This package includes the documentation for texlive-hacm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27671"

RPM_NAME = "texlive-hacm-doc-2023.201.0.0.1svn27671-53.2.noarch.rpm"
RPM_HASH = "5498ffee82927c167fbde1869d854490ad5e4363b3a1290c9fbaadecc5c055ace5961cf7d82b0b841cb883f626d254d372ca30aa1dff9d910cbca3b8ec32685b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hacm-doc"

RDEPENDS:${PN} += ""

inherit rpm
