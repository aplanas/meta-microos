SUMMARY = "Documentation for texlive-uninormalize"
DESCRIPTION = "This package includes the documentation for texlive-uninormalize"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57257"

RPM_NAME = "texlive-uninormalize-doc-2023.201.0.0.1svn57257-53.1.noarch.rpm"
RPM_HASH = "e046aaf852329bfc6da023c4a9c69b04c10ea4b9111622aa1edfb648ae76e32669dbf1e8042d99d52ea69c0a2fc4869fc8978847554840251929ea74ec7a14c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uninormalize-doc"
RDEPENDS:${PN} += ""

inherit rpm
