SUMMARY = "Documentation for texlive-eqnnumwarn"
DESCRIPTION = "This package includes the documentation for texlive-eqnnumwarn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-doc-2023.209.1.0svn45511-54.1.noarch.rpm"
RPM_HASH = "706c6988a2a5711cc151985efb858e7644176b178c0a387a8b5111aaa661a2548f672a498e82891137e9cf544f08872eefa66d3c42290efc49c09effec376bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnnumwarn-doc"

RDEPENDS:${PN} += ""

inherit rpm
