SUMMARY = "Documentation for texlive-multiobjective"
DESCRIPTION = "This package includes the documentation for texlive-multiobjective"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-multiobjective-doc-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "711c95f10a0f4a71eaafb79fa32e28bc5ca04efb1c913f57c1e10a90b33a25c49d6f3b320e38910904fb1316e245225298c6fc7a5a45f5b2a707be3ec096d80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiobjective-doc"

RDEPENDS:${PN} += ""

inherit rpm
