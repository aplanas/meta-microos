SUMMARY = "Documentation for texlive-engrec"
DESCRIPTION = "This package includes the documentation for texlive-engrec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-engrec-doc-2023.209.1.1svn15878-54.2.noarch.rpm"
RPM_HASH = "e8f7d8debec1aea467571d3a6e5b73b183b9de3892a60182b3f8f98c3bf6dc185a290e4ca6cf36222171b07dcd26023c96be5d761870bd87ec85acc20c795f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-engrec-doc"

RDEPENDS:${PN} += ""

inherit rpm
