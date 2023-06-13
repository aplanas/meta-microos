SUMMARY = "Documentation for texlive-jknapltx"
DESCRIPTION = "This package includes the documentation for texlive-jknapltx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-jknapltx-doc-2023.201.svn19440-55.1.noarch.rpm"
RPM_HASH = "1abd764a63888a75e8095297e51c6f8b19825fb699ae74a8f6bc7d636d18144c969a1ffa807b684a4e66fc8ce57c17991861379a16b18c2b208debf2238f6230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jknapltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
