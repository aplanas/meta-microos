SUMMARY = "Documentation for texlive-fig4latex"
DESCRIPTION = "This package includes the documentation for texlive-fig4latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn26313"

RPM_NAME = "texlive-fig4latex-doc-2023.201.0.0.2svn26313-52.1.noarch.rpm"
RPM_HASH = "c580fd8a55296f4632791452099a4e21af52d52aed146e84d1495b1b14159fde3c5fc1360d3fec55c80a25ff286213e50bd11adc59b908dee7c303c84e845720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fig4latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
