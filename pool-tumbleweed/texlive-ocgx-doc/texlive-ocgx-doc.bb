SUMMARY = "Documentation for texlive-ocgx"
DESCRIPTION = "This package includes the documentation for texlive-ocgx"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn54512"

RPM_NAME = "texlive-ocgx-doc-2023.209.0.0.5svn54512-55.1.noarch.rpm"
RPM_HASH = "f88625c59841a9e1b025d83a6dacbefcd8ad69833a67c56f5f41446b4e69c63b2ca4115d07d8be520ae9dfa30f7240fb936c1b28944b78cb8b7a768d77745126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocgx-doc"

RDEPENDS:${PN} += ""

inherit rpm
