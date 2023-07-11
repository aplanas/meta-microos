SUMMARY = "Documentation for texlive-eqnarray"
DESCRIPTION = "This package includes the documentation for texlive-eqnarray"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn20641"

RPM_NAME = "texlive-eqnarray-doc-2023.201.1.3svn20641-53.2.noarch.rpm"
RPM_HASH = "f6fea5f4eb8160a5a3eee0a4abab8d621ea933a4386456f8c726b23ec2e59182221f9843d20df79ee110f9c9dca142b790c2e36bb6caeccf04b8d26db2a1a5a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
