SUMMARY = "Documentation for texlive-active-conf"
DESCRIPTION = "This package includes the documentation for texlive-active-conf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn15878"

RPM_NAME = "texlive-active-conf-doc-2023.209.0.0.3asvn15878-55.1.noarch.rpm"
RPM_HASH = "9902944e323428e2ea63444579ed3dffefcb9e224c741614eb878b6b803b2585b8b7614d15834acbfe1388d637b9f7080d19386632670d8413e128c500580d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-active-conf-doc"

RDEPENDS:${PN} += ""

inherit rpm
