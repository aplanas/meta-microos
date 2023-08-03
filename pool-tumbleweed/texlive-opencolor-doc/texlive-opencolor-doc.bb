SUMMARY = "Documentation for texlive-opencolor"
DESCRIPTION = "This package includes the documentation for texlive-opencolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn66363"

RPM_NAME = "texlive-opencolor-doc-2023.209.1.0.1svn66363-55.1.noarch.rpm"
RPM_HASH = "915c87c35a0ddf45b614f734c416f4a608ac41b60afbff61cc57490a5b616841bf61505a149235c42b591bdaa047cd0a0c6ccbfaa213b5f912c38b9da5b3743e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opencolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
