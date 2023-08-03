SUMMARY = "Documentation for texlive-tkz-berge"
DESCRIPTION = "This package includes the documentation for texlive-tkz-berge"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn57485"

RPM_NAME = "texlive-tkz-berge-doc-2023.209.2.0svn57485-53.1.noarch.rpm"
RPM_HASH = "aa1987ed069953a5e2a634f941869dfef76a9a5cc4c857b38f7238a956365a3623d9ca97c19c1255c7dca9f54646edf45a20f09abd2e2a7f1b7d508915f1227d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-berge-doc"

RDEPENDS:${PN} += ""

inherit rpm
