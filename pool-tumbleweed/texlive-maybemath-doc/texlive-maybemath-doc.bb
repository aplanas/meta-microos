SUMMARY = "Documentation for texlive-maybemath"
DESCRIPTION = "This package includes the documentation for texlive-maybemath"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-maybemath-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "34b07d78940e44b2a810925f8dbac899e55311d267c56ff5e6df07626193afbbd76cc3a36160d94d26cdc65f10a73c7fc969f81e6acb147eab8ddc4e53820546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maybemath-doc"

RDEPENDS:${PN} += ""

inherit rpm
