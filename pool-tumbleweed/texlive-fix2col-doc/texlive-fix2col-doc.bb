SUMMARY = "Documentation for texlive-fix2col"
DESCRIPTION = "This package includes the documentation for texlive-fix2col"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn38770"

RPM_NAME = "texlive-fix2col-doc-2023.209.0.0.04svn38770-53.1.noarch.rpm"
RPM_HASH = "4ce1a7be30cdb9d6b19e634eb5950a6152b387e26e433c547732ff7fabf69a8fb361be9ee0cf811432033c54112337d06c3a610503d9963bf5d5df891b270f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fix2col-doc"

RDEPENDS:${PN} += ""

inherit rpm
