SUMMARY = "Documentation for texlive-changes"
DESCRIPTION = "This package includes the documentation for texlive-changes"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2.1svn59950"

RPM_NAME = "texlive-changes-doc-2023.209.4.2.1svn59950-53.1.noarch.rpm"
RPM_HASH = "d576c8d9f2c42ee2a2affdff31e4a60aa4b6c46d47cd03a2313b797722e0415e8a9c751d932be376397ef30c5197e87888218bf4e1cfd78c4f0b960ba7a5fd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-changes-doc-en;de \
texlive-changes-doc"

RDEPENDS:${PN} += ""

inherit rpm
