SUMMARY = "Documentation for texlive-filecontentsdef"
DESCRIPTION = "This package includes the documentation for texlive-filecontentsdef"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn52208"

RPM_NAME = "texlive-filecontentsdef-doc-2023.201.1.5svn52208-52.1.noarch.rpm"
RPM_HASH = "9a63bbc899e752e9ed920e2aed4ed69d8bed91e3d2738b4461565b789306729108dd7d393cde8880c3c99b5a12132aec0d1e54f35cbc65391490a6067f6d4a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filecontentsdef-doc"
RDEPENDS:${PN} += ""

inherit rpm
