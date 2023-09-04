SUMMARY = "Documentation for texlive-ekaia"
DESCRIPTION = "This package includes the documentation for texlive-ekaia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn49594"

RPM_NAME = "texlive-ekaia-doc-2023.209.1.06svn49594-54.2.noarch.rpm"
RPM_HASH = "1342892b98a95d72c38f8517be6b94fa760f23d325a088202b0e6f4d068a68ee1fea49b7b25633ef834dbf1ee88d91f7f4e076d7ed9f9316f348f6b9cd0b93df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekaia-doc"

RDEPENDS:${PN} += ""

inherit rpm
