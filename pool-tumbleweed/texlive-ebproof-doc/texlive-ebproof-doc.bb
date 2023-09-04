SUMMARY = "Documentation for texlive-ebproof"
DESCRIPTION = "This package includes the documentation for texlive-ebproof"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn57544"

RPM_NAME = "texlive-ebproof-doc-2023.209.2.1.1svn57544-54.2.noarch.rpm"
RPM_HASH = "834e8ab42b8dc69b2e82a92d80ba946c22cbbe826b49e97dc1cd28df6ebc2dfbb0f52d9d45baa8d314f9e8bed7142075e967925b42174374cccdd806a5bf77f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
