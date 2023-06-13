SUMMARY = "Documentation for texlive-onedown"
DESCRIPTION = "This package includes the documentation for texlive-onedown"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn59010"

RPM_NAME = "texlive-onedown-doc-2023.201.1.6svn59010-54.1.noarch.rpm"
RPM_HASH = "4512b46d65fea3e114bea7585cf1d9942fa58b70c129ace7887013d8dbdb7815a9f9dce08e0761c4c52192625f7f144208a09c891d4e69090d324075a0897950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onedown-doc"

RDEPENDS:${PN} += ""

inherit rpm
