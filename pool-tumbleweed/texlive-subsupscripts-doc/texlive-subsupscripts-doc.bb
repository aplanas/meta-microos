SUMMARY = "Documentation for texlive-subsupscripts"
DESCRIPTION = "This package includes the documentation for texlive-subsupscripts"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16080"

RPM_NAME = "texlive-subsupscripts-doc-2023.209.1.0svn16080-58.1.noarch.rpm"
RPM_HASH = "667341a43676e8c7341f50b95b59ebc0a46ea1656fb967be9a5bd3877158dcebd91ca340af364bfe61b4cf4ddd9c625029821b13f678f368ca86dc6ba9f2cabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subsupscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
