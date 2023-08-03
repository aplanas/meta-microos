SUMMARY = "Documentation for texlive-dbshow"
DESCRIPTION = "This package includes the documentation for texlive-dbshow"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn61634"

RPM_NAME = "texlive-dbshow-doc-2023.209.1.5svn61634-53.1.noarch.rpm"
RPM_HASH = "96b0bde50a75673d93871c530d2603accfe280af68fd45b6deb868b960b1c4457a017a7eb4b64d36923687b5aced4d4298e50dcfae7fcbac46b96a58dc82cfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-dbshow-doc-zh \
texlive-dbshow-doc"

RDEPENDS:${PN} += ""

inherit rpm
