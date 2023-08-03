SUMMARY = "Documentation for texlive-babel-galician"
DESCRIPTION = "This package includes the documentation for texlive-babel-galician"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.3csvn30270"

RPM_NAME = "texlive-babel-galician-doc-2023.209.4.3csvn30270-54.1.noarch.rpm"
RPM_HASH = "4282b835717b160f5fbfc736f36db7cac74d96c28d777be604cdef3ac6c9dfed1512ad481f8f476c4104d8e7721a9ce15b329534f8b70748853eb921dda7ed3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-galician-doc"

RDEPENDS:${PN} += ""

inherit rpm
