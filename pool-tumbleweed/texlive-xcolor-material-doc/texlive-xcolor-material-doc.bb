SUMMARY = "Documentation for texlive-xcolor-material"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-material"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-doc-2023.201.0.0.1svn42289-52.2.noarch.rpm"
RPM_HASH = "ebbfbb2f58aa9de249b6dd5a64965aa856a6a1ba481680a1ec658585ffd0dc5b156e9a198153f400b15943d79f81db938b3fc487aa20f09ba52b4da3567133df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-material-doc"

RDEPENDS:${PN} += ""

inherit rpm
