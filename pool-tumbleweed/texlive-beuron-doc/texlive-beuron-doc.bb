SUMMARY = "Documentation for texlive-beuron"
DESCRIPTION = "This package includes the documentation for texlive-beuron"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn46374"

RPM_NAME = "texlive-beuron-doc-2023.209.1.3svn46374-54.1.noarch.rpm"
RPM_HASH = "45c6acba009b6567bf3cc3e75ed2755e1f8f41d7009511d7cb1c92b082e8c9f0f5fbc464a6adb47c164bba59331e83bf19cb9470f4aa1ad03e864d9ce65225a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beuron-doc-de;en \
texlive-beuron-doc"

RDEPENDS:${PN} += ""

inherit rpm
