SUMMARY = "Documentation for texlive-lua-typo"
DESCRIPTION = "This package includes the documentation for texlive-lua-typo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.65svn66513"

RPM_NAME = "texlive-lua-typo-doc-2023.201.0.0.65svn66513-52.1.noarch.rpm"
RPM_HASH = "2ee2e849329c830e876ede41cc0a647bd76b43e1ae294e85eb5e6b63c5d485f98386bd1d79ef97742782b6138b2339f975c1df4a5e3c0fd7627d7def7aa121d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-lua-typo-doc:fr) \
texlive-lua-typo-doc"

RDEPENDS:${PN} += ""

inherit rpm
