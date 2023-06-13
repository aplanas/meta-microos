SUMMARY = "Documentation for texlive-ogham"
DESCRIPTION = "This package includes the documentation for texlive-ogham"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn24876"

RPM_NAME = "texlive-ogham-doc-2023.201.svn24876-54.1.noarch.rpm"
RPM_HASH = "c39caa0a36d7251d46b83971c863b9bcc60c3ec7ed2a83941566f41d2e60ed5a412e15e990159c73a4874c6825e893afb503ed7e6d0a1c46169abe37108c1dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ogham-doc"

RDEPENDS:${PN} += ""

inherit rpm
