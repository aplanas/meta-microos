SUMMARY = "Documentation for texlive-dnaseq"
DESCRIPTION = "This package includes the documentation for texlive-dnaseq"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn17194"

RPM_NAME = "texlive-dnaseq-doc-2023.209.0.0.01svn17194-53.1.noarch.rpm"
RPM_HASH = "69ae97e5bb8a6a0e601a2d5bcad7af660b20cc0444a0e8cf50655a53c9cb2469a8cdb2dbdf8daebc92e667f4fcb4e1f8ef0930c0ea8191de8921d41dca282935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dnaseq-doc"

RDEPENDS:${PN} += ""

inherit rpm
