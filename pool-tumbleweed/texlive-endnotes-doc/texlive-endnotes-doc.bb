SUMMARY = "Documentation for texlive-endnotes"
DESCRIPTION = "This package includes the documentation for texlive-endnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53319"

RPM_NAME = "texlive-endnotes-doc-2023.201.svn53319-53.2.noarch.rpm"
RPM_HASH = "e6d8f08da895d83a31bf24be54e61e466cafe8d350d47c9e3c7950198ddc4fdca9e3f8b89df6d03cdb775fe62bb668e319f9460321666ec46ed7fe5d07c79408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
