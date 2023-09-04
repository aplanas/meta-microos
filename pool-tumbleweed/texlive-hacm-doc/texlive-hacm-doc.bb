SUMMARY = "Documentation for texlive-hacm"
DESCRIPTION = "This package includes the documentation for texlive-hacm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27671"

RPM_NAME = "texlive-hacm-doc-2023.209.0.0.1svn27671-54.2.noarch.rpm"
RPM_HASH = "5ab1207872a425563bc8df244674639494a4c653e8ee6acc6bd8468d5d3b1b9b0190dea37bd58252d3ad4aaf0d2bcc7c96a1ca14b52a7db5e3c27cfc42ae0a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hacm-doc"

RDEPENDS:${PN} += ""

inherit rpm
