SUMMARY = "Documentation for texlive-pst-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pst-soroban"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "0c15f1dbe026e32c5d56790b2362bbf806ca2d7f38c955e0ecdeb3a09f73b54f70c0653bef885b45e1adcaffbd684e152f352a4330fc77e647b34fcbe58cc98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-soroban-doc"

RDEPENDS:${PN} += ""

inherit rpm
