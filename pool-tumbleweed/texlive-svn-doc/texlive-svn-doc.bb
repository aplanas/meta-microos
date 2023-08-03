SUMMARY = "Documentation for texlive-svn"
DESCRIPTION = "This package includes the documentation for texlive-svn"
LICENSE = "LPPL-1.0"

PV = "2023.209.43svn15878"

RPM_NAME = "texlive-svn-doc-2023.209.43svn15878-58.1.noarch.rpm"
RPM_HASH = "67a87e60e2919f527f5b3256410192194f29c48781dfede91d14e33758f1114215d633e8a068cf459cabd69746bffffc1af0e07e74ccb443c68e6e7870584203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-doc"

RDEPENDS:${PN} += ""

inherit rpm
