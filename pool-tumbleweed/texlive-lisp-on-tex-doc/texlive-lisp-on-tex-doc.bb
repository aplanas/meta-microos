SUMMARY = "Documentation for texlive-lisp-on-tex"
DESCRIPTION = "This package includes the documentation for texlive-lisp-on-tex"
LICENSE = "BSD-3-Clause"

PV = "2023.201.2.0svn38722"

RPM_NAME = "texlive-lisp-on-tex-doc-2023.201.2.0svn38722-54.1.noarch.rpm"
RPM_HASH = "b12bb79cd65ae72ccf474902adb3644b25577b9a8ac1220976a77290670178fe77e5b728c7ad902cc8076fcaa29a2f003d84790c51ea56b26ebbe42a1265abc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lisp-on-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm
