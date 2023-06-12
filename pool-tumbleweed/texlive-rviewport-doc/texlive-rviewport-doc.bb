SUMMARY = "Documentation for texlive-rviewport"
DESCRIPTION = "This package includes the documentation for texlive-rviewport"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn23739"

RPM_NAME = "texlive-rviewport-doc-2023.201.1.0svn23739-53.1.noarch.rpm"
RPM_HASH = "5e0b66b00a6ebbd9bc0298c013e58da99f59e3acade1e867019d848ece90955239111f65343f141407b5fd8a95958cdf9a7ea14a53a52c7e7f5f613cd8e23dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rviewport-doc"
RDEPENDS:${PN} += ""

inherit rpm
