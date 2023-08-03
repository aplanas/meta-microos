SUMMARY = "Documentation for texlive-picinpar"
DESCRIPTION = "This package includes the documentation for texlive-picinpar"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn65097"

RPM_NAME = "texlive-picinpar-doc-2023.209.1.3svn65097-52.1.noarch.rpm"
RPM_HASH = "676ec825d08e549f8fb6e19910e28c08409462c5312db02b872e40870552e57c0c185bdd997ef440ef20a9828d4cf418d67b5141ea0de1074fd1d4f920bfbead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-picinpar-doc-de;en \
texlive-picinpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
