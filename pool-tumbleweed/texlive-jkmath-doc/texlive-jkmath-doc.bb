SUMMARY = "Documentation for texlive-jkmath"
DESCRIPTION = "This package includes the documentation for texlive-jkmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn47109"

RPM_NAME = "texlive-jkmath-doc-2023.201.0.0.1svn47109-55.1.noarch.rpm"
RPM_HASH = "873ae1b8c95c56ffa6b642ba0e70658ac99b7a3ef57dfcc4065ab08e635e07207deed7e41c8496c49f7029925ce25cd77be359d44f1bc1046aa3ac54d5c16e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jkmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
