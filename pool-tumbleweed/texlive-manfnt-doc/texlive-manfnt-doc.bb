SUMMARY = "Documentation for texlive-manfnt"
DESCRIPTION = "This package includes the documentation for texlive-manfnt"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54684"

RPM_NAME = "texlive-manfnt-doc-2023.208.svn54684-53.1.noarch.rpm"
RPM_HASH = "ade1e4b1b4920db3920824760c59688cd5bb753ae391b8357588d30d6515416b4043b3bc9687ba3543788dfb8c8f9b9c0a4ab71785b56fb75716d601e6d47e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manfnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
