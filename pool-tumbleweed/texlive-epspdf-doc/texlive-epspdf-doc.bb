SUMMARY = "Documentation for texlive-epspdf"
DESCRIPTION = "This package includes the documentation for texlive-epspdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-doc-2023.201.0.0.6.5.1svn66115-53.2.noarch.rpm"
RPM_HASH = "f3dec43a1d716c5b32f8f3ab5f4ace246c94d917a3292c3a52c2d6c5d7c7e4424cfa19ef0eaf334a787892ef6794fa41ef635cbc6c7d4357cb1b35ecbeee6e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
