SUMMARY = "Documentation for texlive-pecha"
DESCRIPTION = "This package includes the documentation for texlive-pecha"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-pecha-doc-2023.209.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "2c157ca74022176ab4408d2b8a7862bdeb2a22a5d7f0b8ec14b7b8886c93778b95e0d012752505eb51647b574e801b14c5f023b0e4011941d4e7a5a00993a58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pecha-doc"

RDEPENDS:${PN} += ""

inherit rpm
