SUMMARY = "Documentation for texlive-keyfloat"
DESCRIPTION = "This package includes the documentation for texlive-keyfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.08svn65446"

RPM_NAME = "texlive-keyfloat-doc-2023.209.2.08svn65446-56.1.noarch.rpm"
RPM_HASH = "834ef41dcdd80d0001233a31a80e4009c0d43e1aa0f782483167feb8ddeaafb166a4f428d2188a440bc7ae11db9fcde0c273c996ff19c144149a39245d9c6d62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
