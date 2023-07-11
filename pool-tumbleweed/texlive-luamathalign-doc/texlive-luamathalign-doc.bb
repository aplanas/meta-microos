SUMMARY = "Documentation for texlive-luamathalign"
DESCRIPTION = "This package includes the documentation for texlive-luamathalign"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3svn63226"

RPM_NAME = "texlive-luamathalign-doc-2023.208.0.0.3svn63226-53.1.noarch.rpm"
RPM_HASH = "fbe2454e3f123c6f2adf5598a249c142b51bf9ad576d00efcdd135a03a4b0917ab24ea08fd98027b07ee36ffddf07d139e83def317bfbc67e9aa48951cbb186d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamathalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
