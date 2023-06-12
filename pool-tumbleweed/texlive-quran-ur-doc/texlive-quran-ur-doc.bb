SUMMARY = "Documentation for texlive-quran-ur"
DESCRIPTION = "This package includes the documentation for texlive-quran-ur"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-doc-2023.201.0.0.21svn57597-53.1.noarch.rpm"
RPM_HASH = "d66933248ae787112572b5de2546b1e91c530692a858c24d808088dea7bd2317be80f831021ecc8442c3014c6b16d42fc3670aa33b4059f12e2641f57de11af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-ur-doc"
RDEPENDS:${PN} += ""

inherit rpm
