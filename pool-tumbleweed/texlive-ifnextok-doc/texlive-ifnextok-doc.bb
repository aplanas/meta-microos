SUMMARY = "Documentation for texlive-ifnextok"
DESCRIPTION = "This package includes the documentation for texlive-ifnextok"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-doc-2023.208.0.0.3svn23379-53.1.noarch.rpm"
RPM_HASH = "cac118cca293d42f46ba9d152d393ceaa1405c92a62f820805305b7f6e61a456d4c820d6c4c9d9d80955e5197f92296a0512532a2edf885199f6834c7831bd1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifnextok-doc"

RDEPENDS:${PN} += ""

inherit rpm
