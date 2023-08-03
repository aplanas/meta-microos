SUMMARY = "Documentation for texlive-syntrace"
DESCRIPTION = "This package includes the documentation for texlive-syntrace"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-syntrace-doc-2023.209.1.1svn15878-58.1.noarch.rpm"
RPM_HASH = "aad92aa35a4cdc6c5f9a4b191fdd7ba8bc3549148ea8612d743726d9eea0a68ed66c74416946435a147997017514891fc13d049eb8a97c0d1667d79b2b3ac178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syntrace-doc"

RDEPENDS:${PN} += ""

inherit rpm
