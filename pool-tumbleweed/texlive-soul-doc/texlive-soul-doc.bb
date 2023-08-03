SUMMARY = "Documentation for texlive-soul"
DESCRIPTION = "This package includes the documentation for texlive-soul"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn65908"

RPM_NAME = "texlive-soul-doc-2023.209.3.0svn65908-58.1.noarch.rpm"
RPM_HASH = "135fd5120705981819944baebcd64a176f3f9330d17065fb88e80a98ef4747c6dda589e1b9600fe597b3a2f67dea1cb27ab30189a9631b641dbfbf80b70369a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soul-doc"

RDEPENDS:${PN} += ""

inherit rpm
