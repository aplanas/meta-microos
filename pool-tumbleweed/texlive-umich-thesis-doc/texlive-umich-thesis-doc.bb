SUMMARY = "Documentation for texlive-umich-thesis"
DESCRIPTION = "This package includes the documentation for texlive-umich-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn15878"

RPM_NAME = "texlive-umich-thesis-doc-2023.209.1.20svn15878-54.1.noarch.rpm"
RPM_HASH = "a47cfcc8af95e0daf765dcfa404f0559fd46595fe03d4193f3e28b359da0720884a15cf1d1d841089bacead7b19f2ffc10ee3d484cfb3d01d6f51225e0462c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umich-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
