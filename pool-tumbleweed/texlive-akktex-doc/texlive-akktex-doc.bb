SUMMARY = "Documentation for texlive-akktex"
DESCRIPTION = "This package includes the documentation for texlive-akktex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn26055"

RPM_NAME = "texlive-akktex-doc-2023.201.0.0.3.2svn26055-54.1.noarch.rpm"
RPM_HASH = "c10f7f8bf38b9fa7b9ced747b09eccd727d69efae06308af38e885d0b22d0a8bb260293a2211a2df4c876d6323c3f0c715eaa1c46da210a6bce7bf546efc9401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-akktex-doc"

RDEPENDS:${PN} += ""

inherit rpm
