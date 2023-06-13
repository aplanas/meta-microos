SUMMARY = "Documentation for texlive-borceux"
DESCRIPTION = "This package includes the documentation for texlive-borceux"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21047"

RPM_NAME = "texlive-borceux-doc-2023.201.svn21047-52.1.noarch.rpm"
RPM_HASH = "4341bae0c2133697479370456735f3dd36978424cc9465b0d52c482566b160c59c35d86be5ac26b0ed6bc96e795df88366419e6b83a57581e1fcfc37e597955e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-borceux-doc"

RDEPENDS:${PN} += ""

inherit rpm
