SUMMARY = "Documentation for texlive-luaxml"
DESCRIPTION = "This package includes the documentation for texlive-luaxml"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1qsvn60709"

RPM_NAME = "texlive-luaxml-doc-2023.201.0.0.1qsvn60709-52.1.noarch.rpm"
RPM_HASH = "783af3a203c5dfc89b645c2a5b01f199473a6217489b5702e594ce5cdcce744bef114725823d814510cee56081ee546394b7ead9944119efb3b287362d127da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaxml-doc"
RDEPENDS:${PN} += ""

inherit rpm
