SUMMARY = "Documentation for texlive-pinoutikz"
DESCRIPTION = "This package includes the documentation for texlive-pinoutikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn55966"

RPM_NAME = "texlive-pinoutikz-doc-2023.209.1.1.2svn55966-52.1.noarch.rpm"
RPM_HASH = "0f048511551ddb182d84b99d2c2b30fe19e8607806e63bbc589d6836057f11c57dd98ae610e55c97b081ea77795b0884d066bd2466ac401ccab348b357a39363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pinoutikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
