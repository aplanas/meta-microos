SUMMARY = "Documentation for texlive-willowtreebook"
DESCRIPTION = "This package includes the documentation for texlive-willowtreebook"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn60638"

RPM_NAME = "texlive-willowtreebook-doc-2023.209.1.03svn60638-54.1.noarch.rpm"
RPM_HASH = "14e2bf0e76dab015fc4512027078a1fc7830dc3421a2299c2e9597730b48cb03c6e2166dc8d2058ccbeeeb91806c201fa2d2f5296de121e961877cb25739703f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-willowtreebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
