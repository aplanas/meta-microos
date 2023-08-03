SUMMARY = "Documentation for texlive-filemod"
DESCRIPTION = "This package includes the documentation for texlive-filemod"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64967"

RPM_NAME = "texlive-filemod-doc-2023.209.1.2svn64967-53.1.noarch.rpm"
RPM_HASH = "01a71e61cd0a5cb7bba61965013ad15d362e46012376f04aa3669426909359d22115ab1b67495ae9abb0c2058fe7440cf4f3ab9a9a3bd71321d387f9a0218d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filemod-doc"

RDEPENDS:${PN} += ""

inherit rpm
