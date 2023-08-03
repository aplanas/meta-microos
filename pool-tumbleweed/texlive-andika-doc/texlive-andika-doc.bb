SUMMARY = "Documentation for texlive-andika"
DESCRIPTION = "This package includes the documentation for texlive-andika"
LICENSE = "OFL-1.1"

PV = "2023.209.6.101svn64540"

RPM_NAME = "texlive-andika-doc-2023.209.6.101svn64540-55.1.noarch.rpm"
RPM_HASH = "e88a76b198897e0e3b73fce5151fd8f1be8caa1ceaef43a513491ad8f79514308c83ec43df7d933356a90deeaed8d89d083a046efa43850bc20b166b9917531a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-andika-doc"

RDEPENDS:${PN} += ""

inherit rpm
