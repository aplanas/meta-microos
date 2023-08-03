SUMMARY = "Documentation for texlive-filecontents"
DESCRIPTION = "This package includes the documentation for texlive-filecontents"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn52142"

RPM_NAME = "texlive-filecontents-doc-2023.209.1.5svn52142-53.1.noarch.rpm"
RPM_HASH = "34286888918936d60a3f9abf22d1adac096690aa14968df031bd28a274211ca57f8d068256f07ab83b3cd9c8981c2543fe7d1a335f76e2430c41f5cd62923095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filecontents-doc"

RDEPENDS:${PN} += ""

inherit rpm
