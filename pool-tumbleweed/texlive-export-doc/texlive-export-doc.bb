SUMMARY = "Documentation for texlive-export"
DESCRIPTION = "This package includes the documentation for texlive-export"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn27206"

RPM_NAME = "texlive-export-doc-2023.209.1.8svn27206-53.1.noarch.rpm"
RPM_HASH = "a8113a20c2686bf18c2abe7b8e8e22121372c7b2c9211645c11b1d64eb85ca3a5cbbb478294f5ee56ca2440ab99d666e384fe36ab68448f4ebeb5c5e3b90caeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-export-doc"

RDEPENDS:${PN} += ""

inherit rpm
