SUMMARY = "Documentation for texlive-luaxml"
DESCRIPTION = "This package includes the documentation for texlive-luaxml"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1qsvn60709"

RPM_NAME = "texlive-luaxml-doc-2023.208.0.0.1qsvn60709-53.1.noarch.rpm"
RPM_HASH = "f86f28ebb4f0a757afbc3546b0721a3e8989934b7f73400475cdb79a054db9453b5f1904f96843e4638aae44f171a522982b5b74eb6573ed71a14241fea3b813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
