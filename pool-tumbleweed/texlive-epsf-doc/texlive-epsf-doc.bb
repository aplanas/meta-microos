SUMMARY = "Documentation for texlive-epsf"
DESCRIPTION = "This package includes the documentation for texlive-epsf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.7.4svn21461"

RPM_NAME = "texlive-epsf-doc-2023.209.2.7.4svn21461-54.2.noarch.rpm"
RPM_HASH = "e5ef961005d6cefb5f4cdfe3046944ed479a7b9a56a95bd028b58c05547690f64b81059d2ba3f3b8c2003b2b28f3c429d9d34806270c4f3db86346669523b5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
