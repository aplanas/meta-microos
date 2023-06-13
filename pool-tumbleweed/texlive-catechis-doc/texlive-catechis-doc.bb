SUMMARY = "Documentation for texlive-catechis"
DESCRIPTION = "This package includes the documentation for texlive-catechis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn59998"

RPM_NAME = "texlive-catechis-doc-2023.201.2.6svn59998-52.1.noarch.rpm"
RPM_HASH = "cb5a3227231a34398c72e2e894b13424bb0a4caeb3e1a6bf8ed6295050155a9dd0cfd2007bdd94390242351da2d86db89d46638f9d009228e384685e8132fa9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catechis-doc"

RDEPENDS:${PN} += ""

inherit rpm
