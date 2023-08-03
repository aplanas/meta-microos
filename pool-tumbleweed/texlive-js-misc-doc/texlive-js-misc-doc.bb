SUMMARY = "Documentation for texlive-js-misc"
DESCRIPTION = "This package includes the documentation for texlive-js-misc"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16211"

RPM_NAME = "texlive-js-misc-doc-2023.209.svn16211-56.1.noarch.rpm"
RPM_HASH = "4d0c571e90c0937b508424e1947e667a0077b6504d080a46cb18546f7370ec84feae2380d7677ea760939545edf22ec5f5738e69ffdf3e3c4cb88f46cfb52822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-js-misc-doc"

RDEPENDS:${PN} += ""

inherit rpm
