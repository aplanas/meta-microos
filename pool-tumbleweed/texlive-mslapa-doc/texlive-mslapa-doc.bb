SUMMARY = "Documentation for texlive-mslapa"
DESCRIPTION = "This package includes the documentation for texlive-mslapa"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-mslapa-doc-2023.209.svn54080-55.1.noarch.rpm"
RPM_HASH = "c6f7c953c74c68397edfa5829a5153c09e9daaa17b253cf088e498ca46d4f6f0d3e2b097100f96ccb1b1119e778a0351482dc9761585d0996f8655a4f84c209c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mslapa-doc"

RDEPENDS:${PN} += ""

inherit rpm
