SUMMARY = "Documentation for texlive-doctools"
DESCRIPTION = "This package includes the documentation for texlive-doctools"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34474"

RPM_NAME = "texlive-doctools-doc-2023.201.0.0.1svn34474-52.1.noarch.rpm"
RPM_HASH = "f83d4873e25eb41eec3df2261d5c3695cbdbc8848345954638ba0c34ebe15e53e832ac5a145eb217ae64bbb34b749b9d09fe577608067ee6bbd9d1afb7f1d05d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doctools-doc"
RDEPENDS:${PN} += ""

inherit rpm
