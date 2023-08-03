SUMMARY = "Documentation for texlive-leading"
DESCRIPTION = "This package includes the documentation for texlive-leading"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-leading-doc-2023.209.0.0.3svn15878-55.1.noarch.rpm"
RPM_HASH = "7d646a0d20c98c558ad517b5e12ffcd5201f03dcd78168a1301df0c26353c4335c1430dd5d6be55ae9a67fe9a8f79d71fde31402125971d8c0605e4e131990eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leading-doc"

RDEPENDS:${PN} += ""

inherit rpm
