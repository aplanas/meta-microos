SUMMARY = "Documentation for texlive-ytableau"
DESCRIPTION = "This package includes the documentation for texlive-ytableau"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn59580"

RPM_NAME = "texlive-ytableau-doc-2023.201.1.4svn59580-52.1.noarch.rpm"
RPM_HASH = "9cf25f96aa7a0709fe787665d6cb5f9823b7af61c3555b26203e9d39b44d1fff51398fd1c8a11131bf56f374c35763a19c85a218e167bea7044603d0fdafa9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ytableau-doc"
RDEPENDS:${PN} += ""

inherit rpm
