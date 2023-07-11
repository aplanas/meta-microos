SUMMARY = "Documentation for texlive-grffile"
DESCRIPTION = "This package includes the documentation for texlive-grffile"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn52756"

RPM_NAME = "texlive-grffile-doc-2023.201.2.1svn52756-53.2.noarch.rpm"
RPM_HASH = "f15cfbc4673c6c0e2f9d33bcadaf79d9317319fd413741769941778063f058579701d2c5c6f560b1e2aaf5d32288e59ab7987aeeb8b1bba92c63fb01a92f767b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grffile-doc"

RDEPENDS:${PN} += ""

inherit rpm
