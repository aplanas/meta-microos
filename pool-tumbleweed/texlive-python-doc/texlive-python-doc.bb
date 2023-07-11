SUMMARY = "Documentation for texlive-python"
DESCRIPTION = "This package includes the documentation for texlive-python"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.22svn60162"

RPM_NAME = "texlive-python-doc-2023.201.0.0.22svn60162-53.2.noarch.rpm"
RPM_HASH = "2eeab0b29d8c1f4629df90408042cfa7c62df0a5771db919b0b862d3133a13f177079b6b6ef37de97578f7e597180aa6022a8488d225d7347fb493af200053b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
