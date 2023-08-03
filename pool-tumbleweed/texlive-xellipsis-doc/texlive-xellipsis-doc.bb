SUMMARY = "Documentation for texlive-xellipsis"
DESCRIPTION = "This package includes the documentation for texlive-xellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn47546"

RPM_NAME = "texlive-xellipsis-doc-2023.209.2.0svn47546-53.1.noarch.rpm"
RPM_HASH = "d46a765b4bb0ed61fba02a7fd1e860f3a3c8996b0f15b24d20acb1b7609cf40fc7781d861860a08f389d26cece381117adee6d383e2d6b8f93891216372cec43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
