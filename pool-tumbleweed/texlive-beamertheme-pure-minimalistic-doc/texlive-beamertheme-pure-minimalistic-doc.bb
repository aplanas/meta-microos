SUMMARY = "Documentation for texlive-beamertheme-pure-minimalistic"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-pure-minimalistic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.0svn56934"

RPM_NAME = "texlive-beamertheme-pure-minimalistic-doc-2023.209.2.0.0svn56934-54.1.noarch.rpm"
RPM_HASH = "a9e57283cb6d170757c2599e15936a980ae274da0b5896b8a069f95781fa89b77d52b24b50338a65fdd8ba349ae10e48de49f4e9e4b2370d3307e2eb3d2f08f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-pure-minimalistic-doc"

RDEPENDS:${PN} += ""

inherit rpm
