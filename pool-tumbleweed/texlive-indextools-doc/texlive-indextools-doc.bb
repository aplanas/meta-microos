SUMMARY = "Documentation for texlive-indextools"
DESCRIPTION = "This package includes the documentation for texlive-indextools"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.1svn38931"

RPM_NAME = "texlive-indextools-doc-2023.201.1.5.1svn38931-52.1.noarch.rpm"
RPM_HASH = "053cea248df74242953dedbe9ded4126f664feb6fd3ae0824f0b37aeae9d08fc947fec8846659fc56e5bfc615349bb2588467ee948a1a513e9eba5c2484f1bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-indextools-doc"

RDEPENDS:${PN} += ""

inherit rpm
