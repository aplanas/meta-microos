SUMMARY = "Documentation for texlive-beamertheme-saintpetersburg"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-saintpetersburg"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45877"

RPM_NAME = "texlive-beamertheme-saintpetersburg-doc-2023.209.svn45877-54.1.noarch.rpm"
RPM_HASH = "503dc4d9191a62a6dfb79c68e09a4d9f3df8d18e9267fcedfb5125171c3f74f0eec5487d65ec6b209ea155644beac178a29ea11498d8cb6299026589f63a1cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-saintpetersburg-doc"

RDEPENDS:${PN} += ""

inherit rpm
