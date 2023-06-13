SUMMARY = "Documentation for texlive-luapackageloader"
DESCRIPTION = "This package includes the documentation for texlive-luapackageloader"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54779"

RPM_NAME = "texlive-luapackageloader-doc-2023.201.0.0.2svn54779-52.1.noarch.rpm"
RPM_HASH = "9f7d5c4c45d12c12f224481a073492f1a7556f24c83034742884a16d622a7bc63c81ef08dfef90e981c72c004fb3ead55d821cd29cdda14afd4b74e8cb3c4509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapackageloader-doc"

RDEPENDS:${PN} += ""

inherit rpm
