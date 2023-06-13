SUMMARY = "Documentation for texlive-figsize"
DESCRIPTION = "This package includes the documentation for texlive-figsize"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn18784"

RPM_NAME = "texlive-figsize-doc-2023.201.0.0.1svn18784-52.1.noarch.rpm"
RPM_HASH = "7698ac99c8e6dbbeebbbc76f342492791dd7e4a42797db6ade77befc83204fd06b0486f6d6f6b66fc2b247a9d1ccbb4e84aaa4306b213bb48d2fb25d53ef1e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
