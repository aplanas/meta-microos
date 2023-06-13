SUMMARY = "Documentation for texlive-tsvtemplate"
DESCRIPTION = "This package includes the documentation for texlive-tsvtemplate"
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.0svn65333"

RPM_NAME = "texlive-tsvtemplate-doc-2023.201.2022_1.0svn65333-52.1.noarch.rpm"
RPM_HASH = "f83c6d702160a1e3827acdf2433b1c334dba59d301be1ee9df0eec7545a8bec91398bda90765e5b91666d0d66fd4957c7890512a2010e56d9c0f8a1d63c8c3e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tsvtemplate-doc"

RDEPENDS:${PN} += ""

inherit rpm
