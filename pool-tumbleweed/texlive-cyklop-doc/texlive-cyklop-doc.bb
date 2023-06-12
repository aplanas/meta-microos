SUMMARY = "Documentation for texlive-cyklop"
DESCRIPTION = "This package includes the documentation for texlive-cyklop"
LICENSE = "LPPL-1.3c"

PV = "2023.204.0.0.915svn18651"

RPM_NAME = "texlive-cyklop-doc-2023.204.0.0.915svn18651-54.1.noarch.rpm"
RPM_HASH = "79088e5377fea829b8db48043de98d4bd83fdd793b6e59f47cdaadba9d70ec08b76c84fc1e7d90f4556f47b7271a1389280398e375f93fb976505965aec9eb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyklop-doc"
RDEPENDS:${PN} += ""

inherit rpm
