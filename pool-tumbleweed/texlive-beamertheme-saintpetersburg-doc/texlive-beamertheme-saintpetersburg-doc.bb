SUMMARY = "Documentation for texlive-beamertheme-saintpetersburg"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-saintpetersburg"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45877"

RPM_NAME = "texlive-beamertheme-saintpetersburg-doc-2023.201.svn45877-53.1.noarch.rpm"
RPM_HASH = "27a1aed5d8d08e1525faa06605d2766edd13d40397e955d4a89a4564c7d79dd98bfa5dd02763158b2beb00181c7a28795393708607e11943240b57311e62fe83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-saintpetersburg-doc"

RDEPENDS:${PN} += ""

inherit rpm
