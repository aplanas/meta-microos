SUMMARY = "Documentation for texlive-plainpkg"
DESCRIPTION = "This package includes the documentation for texlive-plainpkg"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn27765"

RPM_NAME = "texlive-plainpkg-doc-2023.209.0.0.4asvn27765-52.1.noarch.rpm"
RPM_HASH = "bd78b62ea0e6a69192518c0e544ee808c656a9484812ff822c6dc3be1305768bea47a4b9682c68e583f4140e396961c3233edadb488b29ee01ec5ed03b14ecf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plainpkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
