SUMMARY = "Documentation for texlive-babel-swedish"
DESCRIPTION = "This package includes the documentation for texlive-babel-swedish"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3esvn57647"

RPM_NAME = "texlive-babel-swedish-doc-2023.209.2.3esvn57647-54.1.noarch.rpm"
RPM_HASH = "adf651b43b2743509ea72fb2340ebf39b8ab9219eee3c132a5309fb99c3ba1a18943b8d71ebd2b6d68561435356565b27bd0571d3e0cf0cffe2c73b591ab2ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-swedish-doc"

RDEPENDS:${PN} += ""

inherit rpm
