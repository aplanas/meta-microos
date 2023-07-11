SUMMARY = "Documentation for texlive-medstarbeamer"
DESCRIPTION = "This package includes the documentation for texlive-medstarbeamer"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn38828"

RPM_NAME = "texlive-medstarbeamer-doc-2023.208.svn38828-53.1.noarch.rpm"
RPM_HASH = "1692741389f2b21a23901bee1e12be70b1f9711a783ca50275d0745af570f6adb73db8fce38dc0f121af5904e786904ff78e9472bfb41e7bc9c464eb70130e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-medstarbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
