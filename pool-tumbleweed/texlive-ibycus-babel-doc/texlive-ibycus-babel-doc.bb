SUMMARY = "Documentation for texlive-ibycus-babel"
DESCRIPTION = "This package includes the documentation for texlive-ibycus-babel"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-doc-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "31bed5f4c90fd1ebf43ba09be0d656d4ead5034a3146380e424fab8db539729e024488d84db68dee817f658d1f5647c2ef9899e931fd9bed57f987caf7e4d8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibycus-babel-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
