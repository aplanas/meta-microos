SUMMARY = "Documentation for texlive-numprint"
DESCRIPTION = "This package includes the documentation for texlive-numprint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.39svn27498"

RPM_NAME = "texlive-numprint-doc-2023.201.1.39svn27498-54.1.noarch.rpm"
RPM_HASH = "e3ed1929e4a4015d9a1017963ecdb79c52d570c77350786ac7594fe6d9cf0bab81bc8cb2ebe85464a3d642106a1d12de9d41ec403102964da4385b50bb670252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numprint-doc"
RDEPENDS:${PN} += ""

inherit rpm
