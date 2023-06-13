SUMMARY = "Documentation for texlive-sasnrdisplay"
DESCRIPTION = "This package includes the documentation for texlive-sasnrdisplay"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.95svn63255"

RPM_NAME = "texlive-sasnrdisplay-doc-2023.201.0.0.95svn63255-53.1.noarch.rpm"
RPM_HASH = "2bab080cc288321deda86b1435f0d373f7b3ff01a2ab0b8cb6228611b2d2d2e400041c81859eb0f1d4d40581e8e2fe16dd314defd1fe8e11508def560a8837f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sasnrdisplay-doc"

RDEPENDS:${PN} += ""

inherit rpm
