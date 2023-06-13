SUMMARY = "Documentation for texlive-cascadia-code"
DESCRIPTION = "This package includes the documentation for texlive-cascadia-code"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57478"

RPM_NAME = "texlive-cascadia-code-doc-2023.201.0.0.0.1svn57478-52.1.noarch.rpm"
RPM_HASH = "be82e0bbc505bde13ba2f1f8f9df178ebc985970c4f88573fd8dfa284f55b7c117b402524dd73542f45ada090e46579092714b22620e39b0b17179d172ffba09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cascadia-code-doc"

RDEPENDS:${PN} += ""

inherit rpm
