SUMMARY = "Documentation for texlive-tudscr"
DESCRIPTION = "This package includes the documentation for texlive-tudscr"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.06osvn64085"

RPM_NAME = "texlive-tudscr-doc-2023.201.2.06osvn64085-52.1.noarch.rpm"
RPM_HASH = "d19b1f02a1a3761b206597047e209a868db3dd25dbde1806693cc85230e28e6fd559e146db894f5c81174198342e97e6f86d66ad00f0769a8aa0ae91ef0e66e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tudscr-doc:de) \
texlive-tudscr-doc"
RDEPENDS:${PN} += ""

inherit rpm
