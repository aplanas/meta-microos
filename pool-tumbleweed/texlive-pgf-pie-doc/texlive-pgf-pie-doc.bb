SUMMARY = "Documentation for texlive-pgf-pie"
DESCRIPTION = "This package includes the documentation for texlive-pgf-pie"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7svn63603"

RPM_NAME = "texlive-pgf-pie-doc-2023.201.0.0.7svn63603-51.1.noarch.rpm"
RPM_HASH = "d6ccd84301d3005159f3b0bf160802dffbe88d0b1b6d43300f36022f94fcd8b65dbf4d0de4ad7107bf7005d27d028c91b0049e74f4f2083218dd856de3dfb577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-pie-doc"

RDEPENDS:${PN} += ""

inherit rpm
