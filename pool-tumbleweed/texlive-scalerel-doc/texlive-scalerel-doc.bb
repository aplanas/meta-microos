SUMMARY = "Documentation for texlive-scalerel"
DESCRIPTION = "This package includes the documentation for texlive-scalerel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn42809"

RPM_NAME = "texlive-scalerel-doc-2023.209.1.8svn42809-54.1.noarch.rpm"
RPM_HASH = "224c9975fa121877bdfd18ec70b74dc256fab67cd166dfcb56617e8b47bd47a65f67cde8fdb400f5e7d9422016666ae4071b6407c09bf9d9d534b4db26e06e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scalerel-doc"

RDEPENDS:${PN} += ""

inherit rpm
