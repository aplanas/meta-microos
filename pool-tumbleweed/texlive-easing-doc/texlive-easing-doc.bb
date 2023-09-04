SUMMARY = "Documentation for texlive-easing"
DESCRIPTION = "This package includes the documentation for texlive-easing"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn59975"

RPM_NAME = "texlive-easing-doc-2023.209.0.0.1svn59975-54.2.noarch.rpm"
RPM_HASH = "e04c31c06351fb0d82f5356110a8e019773daa3ca4587d73f64635d090211e0214fdc32c5ed8b984c7fe1f019171c030c24729afc3276ff12899aa7673b1879b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easing-doc"

RDEPENDS:${PN} += ""

inherit rpm
