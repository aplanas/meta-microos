SUMMARY = "Documentation for texlive-lfb"
DESCRIPTION = "This package includes the documentation for texlive-lfb"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-lfb-doc-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "1e17739a0cc7792786902ee1581f36bd76b9cf7f11645c7ffb489a16c1c6a8619c94623902123d2acf87b4eccced32082665df0a8e4047287428c4ec5ef96ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lfb-doc-el \
texlive-lfb-doc"

RDEPENDS:${PN} += ""

inherit rpm
