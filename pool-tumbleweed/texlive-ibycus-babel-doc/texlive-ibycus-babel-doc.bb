SUMMARY = "Documentation for texlive-ibycus-babel"
DESCRIPTION = "This package includes the documentation for texlive-ibycus-babel"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-doc-2023.209.3.0svn15878-54.1.noarch.rpm"
RPM_HASH = "dce2e4e92164582aa802b53b34d030711bc58692c7123a8d1443e3ff172e1ab0d367b4c8c04989e3ad0991acf741404354da33c2fc9d8b99b6bd6cc4e611631d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibycus-babel-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
