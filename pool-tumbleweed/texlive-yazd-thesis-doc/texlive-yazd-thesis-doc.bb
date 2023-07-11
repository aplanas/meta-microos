SUMMARY = "Documentation for texlive-yazd-thesis"
DESCRIPTION = "This package includes the documentation for texlive-yazd-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-doc-2023.201.0.0.3svn61719-52.2.noarch.rpm"
RPM_HASH = "1e85477e57d6024902317f3e7ec443b6406357b7da62aa129fb53761d61ca934b697869d29a3698824fa591d034732bec0bdf3d2e4631f5935d23a2873131b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yazd-thesis-doc-fa \
texlive-yazd-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
