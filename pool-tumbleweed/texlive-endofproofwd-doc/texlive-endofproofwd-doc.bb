SUMMARY = "Documentation for texlive-endofproofwd"
DESCRIPTION = "This package includes the documentation for texlive-endofproofwd"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55643"

RPM_NAME = "texlive-endofproofwd-doc-2023.209.svn55643-54.2.noarch.rpm"
RPM_HASH = "6957ff14d27da272b2597d2e30dcab3f5d14b6efe1b9658cbda3c14958ec67022a080597383f4b45092368ac588540ffa05b6f5489a8f2d0326da0223b52a8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endofproofwd-doc"

RDEPENDS:${PN} += ""

inherit rpm
