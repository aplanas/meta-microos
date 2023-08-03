SUMMARY = "Documentation for texlive-tagging"
DESCRIPTION = "This package includes the documentation for texlive-tagging"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0.1svn52064"

RPM_NAME = "texlive-tagging-doc-2023.209.1.1.0.1svn52064-55.1.noarch.rpm"
RPM_HASH = "9c75f81fd9d13ac8cce9bd58cbfb55710f55a3461dd855cb75c4e0654f1c6ac34a929fc0b24eb53bc1cde41800a219c01086d008c159b355dd257c600955ad23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagging-doc"

RDEPENDS:${PN} += ""

inherit rpm
