SUMMARY = "Documentation for texlive-numprint"
DESCRIPTION = "This package includes the documentation for texlive-numprint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.39svn27498"

RPM_NAME = "texlive-numprint-doc-2023.209.1.39svn27498-55.1.noarch.rpm"
RPM_HASH = "a5e9b6a13f47ac3a6847f7f10d7cccc69af766b98b50059da966febc8a9c29d1cc7010c38199e4013b5ee74620f88b7e5c8f8f2edb728ad0ff1a837debd00919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
