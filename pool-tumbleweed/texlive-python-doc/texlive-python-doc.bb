SUMMARY = "Documentation for texlive-python"
DESCRIPTION = "This package includes the documentation for texlive-python"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.22svn60162"

RPM_NAME = "texlive-python-doc-2023.201.0.0.22svn60162-53.1.noarch.rpm"
RPM_HASH = "ccfa237aae88e8d82c8f9cea85b891ea06332e47687c44b71ae49d21b0f133c07e7b41ebe609c4ea3a9b83593f526715ef1131c06f57394eb4401a6f492db1f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-python-doc"
RDEPENDS:${PN} += ""

inherit rpm
