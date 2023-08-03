SUMMARY = "Documentation for texlive-correctmathalign"
DESCRIPTION = "This package includes the documentation for texlive-correctmathalign"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.1svn44131"

RPM_NAME = "texlive-correctmathalign-doc-2023.209.1.1svn44131-55.1.noarch.rpm"
RPM_HASH = "56bdc15cb14f47c8b74170a01896d794c77c1d6feb77941cc9c649420248b0ff2da97dee6cf8efd8e409c246f571fcd3e9535fcef5d29db991942143234fd365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-correctmathalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
