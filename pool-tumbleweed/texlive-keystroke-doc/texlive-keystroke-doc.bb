SUMMARY = "Documentation for texlive-keystroke"
DESCRIPTION = "This package includes the documentation for texlive-keystroke"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn17992"

RPM_NAME = "texlive-keystroke-doc-2023.201.1.6svn17992-55.1.noarch.rpm"
RPM_HASH = "63e01681514ac1e4bafe52f3984e9fd8120ad52bbb7bdb13afc2b8245d5a76ad0cd50d963a3dcc113ea2200243350129ee6195c438847b73b74d953496b8d99d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keystroke-doc"

RDEPENDS:${PN} += ""

inherit rpm
