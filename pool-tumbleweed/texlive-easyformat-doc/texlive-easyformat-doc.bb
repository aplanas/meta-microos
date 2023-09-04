SUMMARY = "Documentation for texlive-easyformat"
DESCRIPTION = "This package includes the documentation for texlive-easyformat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-doc-2023.209.1.4.0svn44543-54.2.noarch.rpm"
RPM_HASH = "cad5d6f09eee9a34fe530f040cd3171e429c39c9133fbfd8d348e64584eba7e799f6c07dc6cd47bf416702e89eb144da31a111b26aba8a452ad32b7b9d563a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
