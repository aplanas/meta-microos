SUMMARY = "Documentation for texlive-doctools"
DESCRIPTION = "This package includes the documentation for texlive-doctools"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34474"

RPM_NAME = "texlive-doctools-doc-2023.209.0.0.1svn34474-53.1.noarch.rpm"
RPM_HASH = "3e0a297007f70e1d1643ab8c1e2d094c0431ca7619dcddab42dd21ac589f8a131d69455ffa57fcd6ba08bd0bad8320c26fcee9cbedda25af1fab2a929eac271a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doctools-doc"

RDEPENDS:${PN} += ""

inherit rpm
