SUMMARY = "Documentation for texlive-magra"
DESCRIPTION = "This package includes the documentation for texlive-magra"
LICENSE = "OFL-1.1"

PV = "2023.208.0.0.0.1svn57373"

RPM_NAME = "texlive-magra-doc-2023.208.0.0.0.1svn57373-53.1.noarch.rpm"
RPM_HASH = "0cde23ce12705797e68886112e687c1feb2fc0a4ca00d4fcb6b4cd513802957bc7a6b218f21e45001adef18735607149111ab6b201265bf57980cc06bec369be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magra-doc"

RDEPENDS:${PN} += ""

inherit rpm
