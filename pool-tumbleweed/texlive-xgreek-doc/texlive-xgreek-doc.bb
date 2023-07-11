SUMMARY = "Documentation for texlive-xgreek"
DESCRIPTION = "This package includes the documentation for texlive-xgreek"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.0svn64300"

RPM_NAME = "texlive-xgreek-doc-2023.201.3.2.0svn64300-52.2.noarch.rpm"
RPM_HASH = "f966d52cc9c36c441d647ad583522887c8c095c6daa257a23cc71125c3319ad1fe5331f77b02313bd606947679571c82d3156ad7269d644ba56eb27bf50237e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
