SUMMARY = "Documentation for texlive-chemschemex"
DESCRIPTION = "This package includes the documentation for texlive-chemschemex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn46723"

RPM_NAME = "texlive-chemschemex-doc-2023.209.1.2svn46723-54.1.noarch.rpm"
RPM_HASH = "d5b0c086e9a3c8114e3a5fcb7021e77195ed46733531a70246e12ba50d951d98ba4d52ea56a4881d48f15d0bc623edec02d18e9fe6106afde54a918355211135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemschemex-doc"

RDEPENDS:${PN} += ""

inherit rpm
