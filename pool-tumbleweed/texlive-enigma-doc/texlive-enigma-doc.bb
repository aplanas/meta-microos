SUMMARY = "Documentation for texlive-enigma"
DESCRIPTION = "This package includes the documentation for texlive-enigma"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.1svn29802"

RPM_NAME = "texlive-enigma-doc-2023.209.0.0.1svn29802-54.2.noarch.rpm"
RPM_HASH = "c215440ec8bc4017eeddbc7ee623ae8fd321962ae652c87794a9f72a6f3a98ee75e7db4e8588e51db5c79355561bc9fdd6124e76704e79b1ef222636728b6a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enigma-doc"

RDEPENDS:${PN} += ""

inherit rpm
