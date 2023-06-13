SUMMARY = "Documentation for texlive-pst-ob3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-ob3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.22svn54514"

RPM_NAME = "texlive-pst-ob3d-doc-2023.201.0.0.22svn54514-52.1.noarch.rpm"
RPM_HASH = "ff27b9f682c30a8c08ef87f69030259b0a0ac513b574db32be44795f7dcc69b322d4d668319bf06935ddcd1952b94bf578061751ae6200683973819bdc80afb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ob3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
