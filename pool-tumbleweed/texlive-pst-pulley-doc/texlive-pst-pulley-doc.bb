SUMMARY = "Documentation for texlive-pst-pulley"
DESCRIPTION = "This package includes the documentation for texlive-pst-pulley"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-doc-2023.209.0.0.02svn62977-54.2.noarch.rpm"
RPM_HASH = "858ebc17192931c4840d77efa9fbfc55328dc8941af3c8c6df3287b84b217c8aa3c064f541c1a9f1ae4855e8ba6961bab8608bc1f760e609a0cfb7127307c7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pulley-doc"

RDEPENDS:${PN} += ""

inherit rpm
