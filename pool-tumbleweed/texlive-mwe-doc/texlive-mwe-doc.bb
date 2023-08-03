SUMMARY = "Documentation for texlive-mwe"
DESCRIPTION = "This package includes the documentation for texlive-mwe"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64967"

RPM_NAME = "texlive-mwe-doc-2023.209.0.0.5svn64967-55.1.noarch.rpm"
RPM_HASH = "518ef0ce54eb0bb5d384ab410ddb92a74f8348ed411c300863513defa60adb62ee5c2d8b2760f1b7893586b859b12d8af25fee80b4b93e448c9b363c1a8f06a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mwe-doc"

RDEPENDS:${PN} += ""

inherit rpm
