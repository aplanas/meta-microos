SUMMARY = "Documentation for texlive-subfiles"
DESCRIPTION = "This package includes the documentation for texlive-subfiles"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn56977"

RPM_NAME = "texlive-subfiles-doc-2023.201.2.2svn56977-57.1.noarch.rpm"
RPM_HASH = "a942b2678fbb7f4d174e4ada440bc33447b47567b2de343ec6e6e375dd14c202856a05fc826e0ee6e53482ef019b030faa299e725305bbc243a98d320177c119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfiles-doc"

RDEPENDS:${PN} += ""

inherit rpm
