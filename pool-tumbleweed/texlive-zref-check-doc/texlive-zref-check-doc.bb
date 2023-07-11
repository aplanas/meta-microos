SUMMARY = "Documentation for texlive-zref-check"
DESCRIPTION = "This package includes the documentation for texlive-zref-check"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn63845"

RPM_NAME = "texlive-zref-check-doc-2023.201.0.0.3.2svn63845-52.2.noarch.rpm"
RPM_HASH = "3b0540b58ad4c730a796511395162bd07570ff27ae4b51c3fc01b92adade8e9fe2f97b1ef477be2ebb256ba5b505174c19308ac6968b445895290ee9ccef08ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-check-doc"

RDEPENDS:${PN} += ""

inherit rpm
