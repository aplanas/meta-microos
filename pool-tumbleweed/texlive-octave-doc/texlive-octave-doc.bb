SUMMARY = "Documentation for texlive-octave"
DESCRIPTION = "This package includes the documentation for texlive-octave"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-octave-doc-2023.209.svn66115-55.1.noarch.rpm"
RPM_HASH = "bc906661f528c9976d2052138d9bb3d132d190bb2c1ccad062926b1198ba33069f383ee1203fbb22ff3112f327af98bf751585352696622638d720506c04cf8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-octave-doc"

RDEPENDS:${PN} += ""

inherit rpm
