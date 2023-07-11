SUMMARY = "Documentation for texlive-gnu-freefont"
DESCRIPTION = "This package includes the documentation for texlive-gnu-freefont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-gnu-freefont-doc-2023.201.svn29349-53.2.noarch.rpm"
RPM_HASH = "4a1bd297a124d430c73312e177ae55a845582b57291c2c95c4d4636ef09c4a781df055d6afc09e0b14077929c5d0b600d2f37f7644bdfb566dd557fa036da912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
