SUMMARY = "Documentation for texlive-eqnnumwarn"
DESCRIPTION = "This package includes the documentation for texlive-eqnnumwarn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-doc-2023.209.1.0svn45511-54.2.noarch.rpm"
RPM_HASH = "a28640999833e4a9134573e14ac78d06a24d62f51773c817f78565019200a70b678c51085fa510ac831faeeef8a60dd2060b0627cd57e1a632756c8d2a14afb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnnumwarn-doc"

RDEPENDS:${PN} += ""

inherit rpm
