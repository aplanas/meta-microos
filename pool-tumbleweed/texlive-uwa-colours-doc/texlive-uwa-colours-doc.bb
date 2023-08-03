SUMMARY = "Documentation for texlive-uwa-colours"
DESCRIPTION = "This package includes the documentation for texlive-uwa-colours"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn60443"

RPM_NAME = "texlive-uwa-colours-doc-2023.209.1.0.0svn60443-54.1.noarch.rpm"
RPM_HASH = "aee89b5a947a9ec524cdf37c40e31ad061b23d78b35d57ec7c5339ac4cd1648eb3a608bb2d5c091c58d0286f3f2cc1471e9c8f9197a14615b510fbf09c52939b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-colours-doc"

RDEPENDS:${PN} += ""

inherit rpm
