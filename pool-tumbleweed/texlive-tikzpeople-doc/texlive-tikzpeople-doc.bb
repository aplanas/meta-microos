SUMMARY = "Documentation for texlive-tikzpeople"
DESCRIPTION = "This package includes the documentation for texlive-tikzpeople"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn43978"

RPM_NAME = "texlive-tikzpeople-doc-2023.209.0.0.4svn43978-53.1.noarch.rpm"
RPM_HASH = "928f34d910cd5ea602ac2ef7f3900b500291eaddd3791538bd24fdb57a9317264774e89da0cc590a030feb4bd6e073f5ec55f3a986b3c74a5955e062990847a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpeople-doc"

RDEPENDS:${PN} += ""

inherit rpm
