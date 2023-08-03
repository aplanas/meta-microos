SUMMARY = "Documentation for texlive-exercise"
DESCRIPTION = "This package includes the documentation for texlive-exercise"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn35417"

RPM_NAME = "texlive-exercise-doc-2023.209.1.6svn35417-53.1.noarch.rpm"
RPM_HASH = "ccf01d7837e3714c614db0d60ce3824fc489c28426a42c91713c29871fdf9c962a42dd27e9b382f196af80f0277d04f7d3541a5d7ae0b707763bb3fc3a8c6197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercise-doc"

RDEPENDS:${PN} += ""

inherit rpm
