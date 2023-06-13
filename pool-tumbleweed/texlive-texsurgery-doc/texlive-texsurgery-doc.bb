SUMMARY = "Documentation for texlive-texsurgery"
DESCRIPTION = "This package includes the documentation for texlive-texsurgery"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.6.0svn59885"

RPM_NAME = "texlive-texsurgery-doc-2023.201.0.0.6.0svn59885-54.1.noarch.rpm"
RPM_HASH = "6c343d674accace053ec28c96cc8e79826965eb115a987311f0f17dd0f9379789b6147c1f3b51730dd7bc6898a52e25a7dbf11acdd6e2659bff24eede4527abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texsurgery-doc"

RDEPENDS:${PN} += ""

inherit rpm
