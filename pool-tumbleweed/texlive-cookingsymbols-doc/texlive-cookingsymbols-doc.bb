SUMMARY = "Documentation for texlive-cookingsymbols"
DESCRIPTION = "This package includes the documentation for texlive-cookingsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35929"

RPM_NAME = "texlive-cookingsymbols-doc-2023.209.1.1svn35929-55.1.noarch.rpm"
RPM_HASH = "ad11da51d4088f65c957c9d24aa77ca51c7d738ef964edce28926edf78ef4218c61efaf115facf93f3372ff0ba5700e4a8e349b0970875597078d7389f3ce69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cookingsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
