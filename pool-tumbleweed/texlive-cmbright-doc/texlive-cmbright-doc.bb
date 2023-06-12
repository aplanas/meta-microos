SUMMARY = "Documentation for texlive-cmbright"
DESCRIPTION = "This package includes the documentation for texlive-cmbright"
LICENSE = "LPPL-1.0"

PV = "2023.201.8.1svn21107"

RPM_NAME = "texlive-cmbright-doc-2023.201.8.1svn21107-53.1.noarch.rpm"
RPM_HASH = "34717c8a383f8d1a4fbde80850d199bc58322f2940a5626f9d1cd063d155b2e06c31ab372438693be20147d4b6d12fc36a5a2ddc0a1c93cec2f1213a31ade125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmbright-doc"
RDEPENDS:${PN} += ""

inherit rpm
