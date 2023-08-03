SUMMARY = "Documentation for texlive-genmpage"
DESCRIPTION = "This package includes the documentation for texlive-genmpage"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1svn15878"

RPM_NAME = "texlive-genmpage-doc-2023.209.0.0.3.1svn15878-53.1.noarch.rpm"
RPM_HASH = "999f86bdd5f4d96ecd5d340a515dbdb8b5751fbaeb7256f0219dcbdf87e19e26d16c6d85d66bdbaacd1754f2e41162c9d46b3ba760e8658e150440ab8bc9b886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genmpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
