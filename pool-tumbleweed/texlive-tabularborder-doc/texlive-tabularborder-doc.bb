SUMMARY = "Documentation for texlive-tabularborder"
DESCRIPTION = "This package includes the documentation for texlive-tabularborder"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn17885"

RPM_NAME = "texlive-tabularborder-doc-2023.201.1.0asvn17885-54.1.noarch.rpm"
RPM_HASH = "d6400cdc1d08138e794b9ffd590df096ef68938fdfee1d116b0b365d0e67c24493a084caf66eee043502794b53e8bf02ac3a5d240a0b2061c24eff960104c947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularborder-doc"

RDEPENDS:${PN} += ""

inherit rpm
