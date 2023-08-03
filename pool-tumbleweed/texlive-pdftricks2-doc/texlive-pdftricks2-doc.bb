SUMMARY = "Documentation for texlive-pdftricks2"
DESCRIPTION = "This package includes the documentation for texlive-pdftricks2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.01svn31016"

RPM_NAME = "texlive-pdftricks2-doc-2023.209.1.01svn31016-52.1.noarch.rpm"
RPM_HASH = "1d0862c789d8f2699f2b3b9155158227e4fa2925ebd3954fb6a6c197aee8298a829118e45dc2418275c8211066ce2896308947da54750d3b93a2d14a13ccbfb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftricks2-doc"

RDEPENDS:${PN} += ""

inherit rpm
