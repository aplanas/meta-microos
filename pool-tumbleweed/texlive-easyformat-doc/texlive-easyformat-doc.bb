SUMMARY = "Documentation for texlive-easyformat"
DESCRIPTION = "This package includes the documentation for texlive-easyformat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-doc-2023.201.1.4.0svn44543-53.2.noarch.rpm"
RPM_HASH = "25572fdbf42bf661bccd10ec97a7b87dc1bd787c137916ed826de277b0f83e99ca1ba653ac135eb217a1cad1aa2afb9bc9a9dbd2f2fda847374219500be3721e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
